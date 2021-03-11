public class Border  extends Embellishment {

    private int width;

    public Border(int width, Compositor compositor){
        super(compositor);
        this.width=width;
    }


    @Override
    void draw(Window window) {
        for (Glyph child : children) {
            child.draw(window);
        }
window.addBorder(getBounds().getPoint().x,getBounds().getPoint().y,
        getBounds().getHeight()+10, getBounds().getHeight()+2, width);

    }
    public void updateCursor(Bounds cursor, Glyph glyph) {
        cursor.setX(glyph.getBounds().getWidth()+cursor.getPoint().x);
        cursor.setHeight(Math.max(cursor.getHeight(),glyph.getBounds().getHeight()));
        cursor.setWidth(cursor.getWidth()+glyph.getBounds().getWidth());

    }

    public void adjustParent(Bounds bounds){
        getBounds().setHeight(bounds.getHeight());
        getBounds().setWidth(bounds.getWidth());
    }
    Glyph child(int position) {
        return children.get(position);
    }
}
