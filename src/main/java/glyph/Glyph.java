package glyph;

import command.Command;
import iterator.Iterator;
import iterator.NullIterator;
import visitor.GlyphVisitor;
import window.Window;
import java.awt.*;

public abstract class Glyph {
    private Bounds bounds = new Bounds(new Point(0, 0), 0, 0);
    private CompositeGlyph parent = null;
    private Command command = null;
    protected Window window;

    public void compose() { }

    public void adjustParent(Bounds bounds) {
    }

    public abstract void draw(Window window);

    boolean intersects(Point point) {
        return false;
    }

    void insert(Glyph glyph, int position) throws NoChildOperationsException {
        throw new NoChildOperationsException();
    }

    void remove(Glyph glyph) throws NoChildOperationsException {
        throw new NoChildOperationsException();
    }

    Glyph child(int position) throws NoChildOperationsException, NullChildException {
        throw new NoChildOperationsException();
    }

    public CompositeGlyph getParent() {
        return parent;
    }

    public void setParent(CompositeGlyph parent) {
        this.parent = parent;
    }

    public Bounds getBounds() {
        return bounds;
    }

    void setSize(Window window) {
    }
//    public String toString() {
//        return bounds.getPoint().x + " " + bounds.getPoint().y + " " + bounds.getHeight() + " " + bounds.getWidth();
//        return
//    }
    public Command getCommand() { return command; }
    public void setCommand(Command command) { this.command = command; }

    public Glyph find(int i, int j) {
        return null;
    }

    public Iterator<Glyph> createIterator(){
        return new NullIterator<Glyph>();
    }
    //call accept method to analyze this glyph
    public void accept(GlyphVisitor v){ }
}
