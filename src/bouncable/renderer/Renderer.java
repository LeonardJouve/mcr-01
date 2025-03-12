package bouncable.renderer;

import bouncable.Bouncable;

import java.awt.*;

public interface Renderer {
    void display(Graphics2D g, Bouncable b);
}
