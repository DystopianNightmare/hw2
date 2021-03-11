public class Scrollbar extends Embellishment {


    public Scrollbar(Compositor compositor) {
        super(compositor);
    }


    @Override
    void draw(Window window) {
        for (Glyph child : children) {
            child.draw(window);
        }
        window.addScrollBar(getBounds().getPoint().x, getBounds().getPoint().y,
                15, getBounds().getHeight() + getBounds().getPoint().y);

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
