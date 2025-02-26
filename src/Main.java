import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int FPS = 60;
    private static final int MIN_SHAPE_SIZE = 10;
    private static final int MAX_SHAPE_SIZE = 50;
    private static final int SHAPE_COUNT = 100;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        new Main().run();
    }
}