import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int FPS = 60;
    private static final int MIN_SHAPE_SIZE = 10;
    private static final int MAX_SHAPE_SIZE = 50;
    private static final int SHAPE_COUNT = 100;
    private static final Random RANDOM = new Random();

    private final List<Shape> shapes;
    private final Displayer displayer;

    public Main() {
        shapes = new ArrayList<>();
        displayer = DisplayerBouncer.getInstance();
        displayer.setTitle("MCR Labo 1");

        Movable movementManager = new MovementManager(displayer.getWidth(), displayer.getHeight());
        for (int i = 0; i < SHAPE_COUNT; ++i) {
            int size = RANDOM.nextInt(MAX_SHAPE_SIZE - MIN_SHAPE_SIZE + 1) + MIN_SHAPE_SIZE;
            Position position = Position.getRandom(displayer.getWidth(), displayer.getHeight(), size);
            Vector vector = Vector.getRandom(displayer.getWidth(), displayer.getHeight());

            Shape shape;
            if (RANDOM.nextInt() % 2 == 0) {
                shape = new Circle(position, vector, movementManager, size);
            } else {
                shape = new Square(position, vector, movementManager, size);
            }

            shapes.add(shape);
        }
    }

    public void run() {
        Graphics2D graphics = displayer.getGraphics();
        while (true) {
            try {
                Thread.sleep(1000 / FPS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            displayer.repaint();
            for (Shape shape : shapes) {
                shape.move();
                shape.draw(graphics);
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}