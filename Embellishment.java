public abstract class Embellishment extends CompositeGlyph{

    void insert(Glyph glyph, int position) {
        glyph.setParent(glyph.getParent());
        try {
            this.children.add(position, glyph.child(0));
        } catch (NoChildOperationsException e) {
            e.printStackTrace();
        } catch (NullChildException e) {
            e.printStackTrace();
        }
        Glyph root = glyph;
        while (root.getParent() != null) {
            root = root.getParent();
        }
        root.compose();
    }
}
