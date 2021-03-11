import java.awt.*;

public class Bounds {
    private int height;
    private int width;
    private Point point;

    public Bounds(Point point, int height, int width) {
        this.point = point;
        this.height = height;
        this.width = width;
    }

    public Bounds(Composition c) {
        this.point =  new Point(c.getBounds().getPoint());
        this.height = 0;
        this.width = 0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point.x = point.x;
        this.point.y = point.y;
    }

    public void setX(int x) {
        this.point.x = x;
    }

    public void setY(int y) {
        this.point.y = y;
    }

    public String toString() {
        return getPoint().x + " " + getPoint().y + " " + getHeight() + " " + getWidth();
    }
}
