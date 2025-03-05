import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

public class DisplayerBouncer implements Displayer {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private static DisplayerBouncer instance;
    private final JFrame frame;
    private final JPanel panel;

    public static DisplayerBouncer getInstance() {
        if (instance == null) {
            instance = new DisplayerBouncer();
        }
        return instance;
    }

    private DisplayerBouncer() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setResizable(false);

        panel = new JPanel();

        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public int getWidth() {
        return panel.getSize().width;
    }

    @Override
    public int getHeight() {
        return panel.getSize().height;
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) panel.getGraphics();
    }

    @Override
    public void repaint() {
        panel.repaint();
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void addKeyListener(KeyAdapter keyAdapter) {
        frame.addKeyListener(keyAdapter);
    }
}
