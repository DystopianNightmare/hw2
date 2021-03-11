import java.util.ArrayList;
import java.util.List;

public abstract class CompositeGlyph extends Glyph {

    protected ArrayList<Glyph> children = new ArrayList<Glyph>();


    Glyph child(int position) throws NullChildException {
        if (children.get(position) == null) {
            throw new NullChildException();
        }
        return children.get(position);
    }

    void insert(Glyph glyph, int position) {
        glyph.setParent(this);
        this.children.add(position, glyph);
        Glyph root = glyph;
        while (root.getParent() != null) {
            root = root.getParent();
        }
        root.compose();
    }

    void remove(Glyph glyph) {
        this.children.remove(glyph);
        Glyph root = glyph;
        while (root.getParent() != null) {
            root = root.getParent();
        }
        root.compose();
    }
    public List<Glyph> getChildren() {
        return children;
    }
}
