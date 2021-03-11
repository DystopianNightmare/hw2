public abstract class Composition extends CompositeGlyph {

    protected Compositor compositor;

    public Composition(Compositor compositor) {
        this.compositor = compositor;
        compositor.setComposition(this);
    }

    abstract void updateCursor(Bounds cursor, Glyph glyph);

    @Override
    public void compose() {
        compositor.compose();
    }
}
