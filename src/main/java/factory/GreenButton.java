package factory;

import glyph.Bounds;
import glyph.Compositor;
import glyph.Glyph;
import glyph.NoChildOperationsException;
import window.Window;

class GreenButton extends Button {

    GreenButton(Compositor compositor, Glyph g) throws NoChildOperationsException {
        super(compositor);
        children.add(0,g);
    }

    public void draw(Window window) {
        window.drawButton(getBounds().getPoint().x, getBounds().getPoint().y,getBounds().getWidth(),
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


}