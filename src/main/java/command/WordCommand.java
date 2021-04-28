package command;

import glyph.CompositeGlyph;
import glyph.Glyph;
import iterator.Iterator;
import iterator.PreorderIterator;
import visitor.GlyphVisitor;
import visitor.WordVisitor;
import window.Window;

public class WordCommand extends Command {

    private Window window;
    private int state;

    public WordCommand(Window window){
        this.window=window;
    }

    public void Execute() {
        CompositeGlyph g = window.getRoot();
        GlyphVisitor visitor = new WordVisitor();
        Iterator<Glyph> i = new PreorderIterator<Glyph>(g);
        for (i.first(); !i.isDone(); i.next()) {
            Glyph current=i.currentItem();
            current.accept(visitor);
        }
        System.out.println(visitor);
    }
    public int getState() { return state; }
}
