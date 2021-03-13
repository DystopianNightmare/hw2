public abstract class Embellishment extends Composition{

    public Embellishment(Compositor compositor) {
        super(compositor);
    }

    void insert(Glyph glyph, int position) {


            this.children.add(0,glyph);
            glyph.setParent(this);
        Glyph root = glyph;
        while (root.getParent() != null) {
            root = root.getParent();
        }
        root.compose();






    }

}
