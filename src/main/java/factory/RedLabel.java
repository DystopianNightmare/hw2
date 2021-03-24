package factory;

import glyph.*;
import window.Window;

class RedLabel extends Label {



    RedLabel(Compositor compositor) {
        super(compositor);


        // draw button?

    }

    public void draw(Window window) {
        super.draw(window);
        window.drawLabel(getBounds().getPoint().x, getBounds().getPoint().y,20,20,"red");
    }

    protected void updateCursor(Bounds cursor, Glyph glyph) {

    }

    @Override
    public void insert(Glyph glyph, int position) throws NoChildOperationsException {
        children.add(0,glyph);
    }
}