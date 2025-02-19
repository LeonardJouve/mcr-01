import java.util.Random;

public class Vector {
    private int dx, dy;
    private static final Random RANDOM = new Random();

    public Vector(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public static Vector getRandom(Dimension dimension) {
        int dx = (RANDOM.nextInt(2 * dimension.width()) - dimension.width()) / 100;
        int dy = (RANDOM.nextInt(2 * dimension.height()) - dimension.height()) / 100;
        return new Vector(dx, dy);
    }
}

