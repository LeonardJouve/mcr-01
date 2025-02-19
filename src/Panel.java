import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Panel extends JPanel implements Runnable {
    private final List<Shape> shapes = new ArrayList<>();
    private static final int FPS = 60;
    private static final int MAX_SIZE = 50;
    private static final Random RANDOM = new Random();

    public Panel(Dimension dimension) {
        this.setSize(dimension.width(), dimension.height());
        Movable movementManager = new MovementManager(dimension);

        while (shapes.size() < 40) {
            Position position = Position.getRandom(dimension);
            Vector vector = Vector.getRandom(dimension);

            Shape shape;
            if (RANDOM.nextInt() % 2 == 0) {
                shape = new Circle(position, vector, movementManager, RANDOM.nextInt(MAX_SIZE));
            } else {
                shape = new Square(position, vector, movementManager, RANDOM.nextInt(MAX_SIZE));
            }

            shapes.add(shape);
            this.add(shape);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000 / FPS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (Shape shape : shapes) {
                shape.move();
            }

            repaint();
        }
    }
}
