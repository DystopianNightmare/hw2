public class Rectangle extends Glyph {


    public Rectangle(int height, int width) {
        this.getBounds().setHeight(height);
        this.getBounds().setWidth(width);
    }

    @Override
    void draw(Window window) {
        window.drawRectangle(getBounds().getPoint().x, getBounds().getPoint().y, getBounds().getWidth(), getBounds().getHeight());
    }
}
