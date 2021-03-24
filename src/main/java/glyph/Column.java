package glyph;
import window.*;
public class Column extends Composition {

    public Column(Compositor compositor) {
        super(compositor);
    }

    public Column(String[] strings, Compositor compositor) {
        super(compositor);
        try {
            for (int i=0; i<strings.length; i++)
                insert(new Row(strings[i],compositor),i );
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
        cursor.setY(glyph.getBounds().getHeight()+cursor.getPoint().y);
        cursor.setHeight(cursor.getHeight()+glyph.getBounds().getHeight());
        cursor.setWidth(Math.max(cursor.getWidth(), glyph.getBounds().getWidth()));
    }

    public void adjustParent(Bounds bounds){
        getBounds().setHeight(bounds.getHeight());
        getBounds().setWidth(bounds.getWidth());
    }
}
