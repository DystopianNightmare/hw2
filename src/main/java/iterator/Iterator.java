package iterator;

public abstract class Iterator<Glyph> {

    private Glyph state;

    public void first(){ }
    public void next(){}
    public boolean isDone(){return true;}
    public glyph.Glyph currentItem(){return null;}
}
