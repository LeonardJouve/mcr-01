import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int FPS = 60;
    private static final int MIN_SHAPE_SIZE = 10;
    private static final int MAX_SHAPE_SIZE = 50;
    private static final Random RANDOM = new Random();

    private final List<Bouncable> shapes;
    private final Displayer displayer;
    private final Movable movementManager;

    private interface Generator {
        Bouncable generate(Position position, Vector vector, Movable movable, int size);
    }

    private Bouncable generateRandBouncable(Generator generator) {
        int size = RANDOM.nextInt(MAX_SHAPE_SIZE - MIN_SHAPE_SIZE + 1) + MIN_SHAPE_SIZE;
        Position position = Position.getRandom(displayer.getWidth(), displayer.getHeight(), size);
        Vector vector = Vector.getRandom(displayer.getWidth(), displayer.getHeight());

        return generator.generate(position, vector, movementManager, size);
    }

    public Main() {
        shapes = new ArrayList<>();
        displayer = DisplayerBouncer.getInstance();
        displayer.setTitle("MCR Labo 1");

        movementManager = new MovementManager(displayer.getWidth(), displayer.getHeight());

        displayer.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_E:
                        shapes.clear();
                        break;
                    case KeyEvent.VK_F:
                        for (int i = 0; i < 10; ++i) {
                            shapes.add(generateRandBouncable(FilledFactory.getInstance()::createSquare));
                            shapes.add(generateRandBouncable(FilledFactory.getInstance()::createCircle));
                        }
                        break;
                    case KeyEvent.VK_B:
                        for (int i = 0; i < 10; ++i) {
                            shapes.add(generateRandBouncable(StrokedFactory.getInstance()::createSquare));
                            shapes.add(generateRandBouncable(StrokedFactory.getInstance()::createCircle));
                        }
                        break;
                    case KeyEvent.VK_Q:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid key");
                }
            }
        });
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000 / FPS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            displayer.repaint();
            for (Bouncable bouncable : shapes) {
                bouncable.move();
                bouncable.draw();
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}