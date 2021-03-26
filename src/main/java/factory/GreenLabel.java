package factory;

import glyph.Bounds;
import glyph.Compositor;
import glyph.Glyph;
import glyph.NoChildOperationsException;
import window.Window;

class GreenLabel extends Label {

    GreenLabel(Compositor compositor, Glyph glyph) throws NoChildOperationsException {
        super(compositor);
        this.children.add(0,glyph);
    glyph.setParent(this);
    }

    public void draw(Window window) {

        window.drawLabel(getBounds().getPoint().x, getBounds().getPoint().y,getBounds().getWidth(),
                getBounds().getHeight() ,"green");
        super.draw(window);
    }

    public void updateCursor(Bounds cursor, Glyph glyph) {
        cursor.setX(glyph.getBounds().getWidth() + cursor.getPoint().x);
        cursor.setHeight(Math.max(cursor.getHeight(), glyph.getBounds().getHeight()));
        cursor.setWidth(cursor.getWidth() + glyph.getBounds().getWidth());
    }

    public void adjustParent(Bounds bounds) {
        getBounds().setHeight(bounds.getHeight());
        getBounds().setWidth(bounds.getWidth());
    }

//    @Override
//    public void insert(Glyph glyph, int position) throws NoChildOperationsException {
//        children.add(0,glyph);
//    }
}