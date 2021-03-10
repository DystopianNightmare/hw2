import java.awt.*;

public class Row extends Composition {

    public Row(Compositor compositor) {
        super(compositor);
    }
    public Row(String string, Compositor compositor) {
        super(compositor);
        try {
            for (int i=0; i<string.length(); i++)
                insert(new Character(string.charAt(i)),i);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    void draw(Window window) {
        for (Glyph child : children) {
            child.draw(window);
        }
    }

    Glyph child(int position) {
        return children.get(position);
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

}
