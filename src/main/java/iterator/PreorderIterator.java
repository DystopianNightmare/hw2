package iterator;

import glyph.CompositeGlyph;
import glyph.Glyph;
import java.util.List;
import java.util.Stack;

public class PreorderIterator<G> extends Iterator<G> {


    private Glyph currentItem;
    private int index;
    private PreorderIterator<Glyph> iterator;
    private Stack<Iterator> stack = new Stack<Iterator>();
    private Glyph root;

    public PreorderIterator(CompositeGlyph root){
       this.root=root;
        index=0;
    }

    public void first(){
        Iterator<Glyph> iter = root.createIterator();
        iter.first();

            stack.push(iter);

    }
    public void next(){
        Iterator<Glyph> iter =  stack.peek().currentItem().createIterator();
        iter.first();
        stack.push(iter);

            while (!stack.empty() && stack.peek().isDone()) {
                stack.pop();
                if (!stack.empty() && !stack.peek().isDone()) {
                   stack.peek().next();

            }
        }
    }
    public boolean isDone(){ return stack.empty();}
    public Glyph currentItem(){
        return stack.peek().currentItem();

    }
}