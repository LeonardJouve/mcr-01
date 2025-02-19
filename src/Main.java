import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int FPS = 60;
    private static final int MIN_SIZE = 10;
    private static final int MAX_SIZE = 50;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        Dimension dimension = new Dimension(800, 600);
        final List<Shape> shapes = new ArrayList<>();

        frame.setTitle("MCR Labo 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(dimension.width(), dimension.height());
        frame.setResizable(false);

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Shape shape : shapes) {
                    shape.paint(g);
                }
            }
        };

        panel.setPreferredSize(new java.awt.Dimension(dimension.width(), dimension.height()));
        Movable movementManager = new MovementManager(dimension);

        while (shapes.size() < 40) {
            int size = RANDOM.nextInt(MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE;
            Position position = Position.getRandom(dimension, size);
            Vector vector = Vector.getRandom(dimension);

            Shape shape;
            if (RANDOM.nextInt() % 2 == 0) {
                shape = new Circle(position, vector, movementManager, size);
            } else {
                shape = new Square(position, vector, movementManager, size);
            }

            shapes.add(shape);
            panel.add(shape);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

        while (true) {
            try {
                Thread.sleep(1000 / FPS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (Shape shape : shapes) {
                shape.move();
            }

            panel.repaint();
        }

    }
}