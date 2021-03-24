import java.awt.*;
public class Border extends Embellishment {

    private int width;

    public Border(int width, Compositor compositor, Glyph g) throws NoChildOperationsException {
        super(compositor);
        this.width = width;
        children.add(0,g);
    }

    @Override
    void draw(Window window) {
        super.draw(window);
        window.addBorder(getBounds().getPoint().x, getBounds().getPoint().y,
                getBounds().getWidth()+getBounds().getPoint().x, getBounds().getHeight() + getBounds().getPoint().y, width);
    }

    public void updateCursor(Bounds cursor, Glyph glyph) {
        cursor.setX(glyph.getBounds().getWidth() + cursor.getPoint().x);
        cursor.setHeight(Math.max(cursor.getHeight(), glyph.getBounds().getHeight()));
        cursor.setWidth(cursor.getWidth() + glyph.getBounds().getWidth());
    }

    public void adjustParent(Bounds bounds) {
        getBounds().setHeight(bounds.getHeight()+width*2);
        getBounds().setWidth(bounds.getWidth()+width*2);
    }

    @Override
    public void compose(){
        Bounds cursor = new Bounds(this.compositor.composition);

        for (int i = 0; i < this.compositor.composition.getChildren().size(); i++) {
            try {
                Glyph child = this.compositor.composition.child(i);
                child.setSize(window);
                child.getBounds().setPoint(new Point(cursor.getPoint().x+width, cursor.getPoint().y+width));
                child.compose();
                this.compositor.composition.updateCursor(cursor, child);
            } catch (NullChildException e) {
            }
        }
        this.compositor.composition.adjustParent(cursor);
    }
}
