package glyph;
import window.*;
public abstract class Embellishment extends Composition{

    public Embellishment(Compositor compositor) {
        super(compositor);
    }

    @Override
    public void draw(Window window) {
        children.get(0).draw(window);
    }

    public void insert(Glyph glyph, int position) throws NoChildOperationsException {
        children.get(0).insert(glyph,position);
    }

    void remove(Glyph glyph) throws NoChildOperationsException {
        children.get(0).remove(glyph);
    }
}
