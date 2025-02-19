import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Dimension dimension;

    public Frame(int width, int height) {
        dimension = new Dimension(width, height);
        this.setTitle("MCR Labo 1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(dimension.width(), dimension.height());
        this.setResizable(false);

        Panel panel = new Panel(dimension);
        this.add(panel, BorderLayout.CENTER);
        this.setVisible(true);
        panel.run();
    }
}
