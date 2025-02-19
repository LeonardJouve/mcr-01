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
        int dx = RANDOM.nextInt(dimension.width()) / 10;
        int dy = RANDOM.nextInt(dimension.height()) / 10;
        return new Vector(dx, dy);
    }
}

