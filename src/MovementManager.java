public class MovementManager implements Movable {
    private int height;
    private int width;

    public MovementManager(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void move(Position position, Vector vector, int size) {
        if (position.getX() + size > width) position.setX(width - size);
        if (position.getX() < 0) position.setX(0);
        if (position.getY() + size > height) position.setY(height - size);
        if (position.getY() < 0) position.setY(0);


        position.setX(position.getX() + vector.getDx());
        position.setY(position.getY() + vector.getDy());

        if (isOutboundVertical(position, size)) bounceVertical(vector);
        if (isOutboundHorizontal(position, size)) bounceHorizontal(vector);
    }

    private boolean isOutboundVertical(Position position, int size) {
        return position.getY() < 0 || position.getY() + size >= height;
    }

    private boolean isOutboundHorizontal(Position position, int size) {
        return position.getX() < 0 || position.getX() + size >= width;
    }

    private void bounceVertical(Vector vector) {
        vector.setDy(-vector.getDy());
    }

    private void bounceHorizontal(Vector vector) {
        vector.setDx(-vector.getDx());
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
