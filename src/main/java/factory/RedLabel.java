package factory;

import glyph.*;
import window.Window;

class RedLabel extends Label {

    RedLabel(Compositor compositor, Glyph g) throws NoChildOperationsException {
        super(compositor);
        insert(g, 0);
    }

    public void draw(Window window) {
        super.draw(window);
        window.drawLabel(getBounds().getPoint().x, getBounds().getPoint().y,getBounds().getWidth(),
                getBounds().getHeight() ,"red");
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

    @Override
    public void insert(Glyph glyph, int position) throws NoChildOperationsException {
        children.add(0,glyph);
    }
}