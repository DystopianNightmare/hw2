package glyph;

public abstract class Compositor {
    public Composition composition;
    public void setComposition(Composition composition) {this.composition=composition;}
    abstract void compose();

}