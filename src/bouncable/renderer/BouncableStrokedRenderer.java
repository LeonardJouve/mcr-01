package bouncable.renderer;

import bouncable.Bouncable;

import java.awt.*;

public class BouncableStrokedRenderer implements Renderer {

    private static BouncableStrokedRenderer instance;

    public static BouncableStrokedRenderer getInstance() {
        if (instance == null) {
            instance = new BouncableStrokedRenderer();
        }

        return instance;
    }

    private BouncableStrokedRenderer() {}

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(2));
        g.draw(b.getShape());
    }
}
