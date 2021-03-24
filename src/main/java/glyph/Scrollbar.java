package glyph;
import window.*;
public class Scrollbar extends Embellishment {

private int thickness;

    public Scrollbar(Compositor compositor, Glyph g) throws NoChildOperationsException {
        super(compositor);
        thickness = 10;
        children.add(0,g);
    }

    @Override
    public void draw(Window window) {
        super.draw(window);
        window.addScrollBar((getBounds().getPoint().x+getBounds().getWidth())-thickness, getBounds().getPoint().y,
                thickness, Math.max(getBounds().getPoint().y,getBounds().getHeight())-1);

    }

    public void updateCursor(Bounds cursor, Glyph glyph) {
        cursor.setX(glyph.getBounds().getWidth() + cursor.getPoint().x);
        cursor.setHeight(Math.max(cursor.getHeight(), glyph.getBounds().getHeight()));
        cursor.setWidth(cursor.getWidth() + glyph.getBounds().getWidth());
    }

    public void adjustParent(Bounds bounds) {
        getBounds().setHeight(bounds.getHeight());
        getBounds().setWidth(bounds.getWidth()+thickness);
    }
}
