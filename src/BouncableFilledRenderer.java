import java.awt.*;

class BouncableFilledRenderer implements Renderer {

    private static BouncableFilledRenderer instance;

    public static BouncableFilledRenderer getInstance() {
        if (instance == null) {
            instance = new BouncableFilledRenderer();
        }

        return instance;
    }

    private BouncableFilledRenderer() {}

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
}