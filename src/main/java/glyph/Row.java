package glyph;
import visitor.GlyphVisitor;
import window.*;
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
    public void draw(Window window) {
        for (Glyph child : children) {
            child.draw(window);
        }
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
    public void accept(GlyphVisitor v){
        v.visit(this);
    }
}
