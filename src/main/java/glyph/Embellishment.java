package glyph;
import visitor.GlyphVisitor;
import window.*;
public abstract class Embellishment extends Composition{

    public Embellishment(Compositor compositor) {
        super(compositor);
    }

    @Override
    public void draw(Window window) {
        children.get(0).draw(window);
    }
    public void accept(GlyphVisitor v){
        v.visit(this);
    }
}
