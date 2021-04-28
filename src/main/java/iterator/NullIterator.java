package iterator;

public class NullIterator<Glyph> extends Iterator<Glyph> {

    public NullIterator(){ }
    public void first(){ }
    public void next(){}
    public boolean isDone(){return true;}
    public glyph.Glyph currentItem(){return null;}
}
