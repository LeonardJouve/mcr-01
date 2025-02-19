import java.util.Random;

public class Position {
    private int x;
    private int y;
    private static final Random RANDOM = new Random();

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static Position getRandom(Dimension dimension, int size) {
        return new Position(RANDOM.nextInt(dimension.width() - size), RANDOM.nextInt(dimension.height() - size));
    }
}
