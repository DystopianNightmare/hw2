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
}
