import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;

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
        frame.setResizable(true);

        panel = new JPanel();
        im = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        panel.addComponentListener(new ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                if (getWidth() <= 0 || getHeight() <= 0) return;
                im = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
            }
        });

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

    private Image im;

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) im.getGraphics();
    }

    @Override
    public void repaint() {
        panel.getGraphics().drawImage(im, 0, 0, panel);
        im.flush();

        getGraphics().setColor(Color.WHITE);
        getGraphics().fillRect(0, 0, getWidth(), getHeight());
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
