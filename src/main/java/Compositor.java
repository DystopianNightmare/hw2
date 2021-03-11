public abstract class Compositor {
    protected Composition composition;
    public void setComposition(Composition composition) {this.composition=composition;}
    abstract void compose();

}