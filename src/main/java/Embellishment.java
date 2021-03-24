import java.util.List;

public abstract class Embellishment extends Composition{

    public Embellishment(Compositor compositor) {
        super(compositor);
    }

    @Override
    void draw(Window window) {
        children.get(0).draw(window);
    }

    void insert(Glyph glyph, int position) throws NoChildOperationsException {
        children.get(0).insert(glyph,position);
    }

    void remove(Glyph glyph) throws NoChildOperationsException {
        children.get(0).remove(glyph);
    }
}
