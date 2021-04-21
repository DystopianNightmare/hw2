package glyph;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeGlyph extends Glyph {

    protected ArrayList<Glyph> children = new ArrayList<Glyph>();


    Glyph child(int position) throws NullChildException {
        if (children.get(position) == null) {
            throw new NullChildException();
        }
        return children.get(position);
    }

    public void insert(Glyph glyph, int position) throws NoChildOperationsException {
        glyph.setParent(this);
        this.children.add(position, glyph);
        Glyph root = glyph;
        while (root.getParent() != null) {
            root = root.getParent();
        }
        root.compose();
    }

    void remove(Glyph glyph) throws NoChildOperationsException {
        this.children.remove(glyph);
        Glyph root = glyph;
        while (root.getParent() != null) {
            root = root.getParent();
        }
        root.compose();
    }
    public List<Glyph> getChildren() {
        return children;
    }

//    @Override
    public Glyph find(int i, int j){
        Glyph ret = null;
        for (int k = 0; k < children.size(); k++) {
            Glyph child = children.get(k);
            if(child.getBounds().getPoint().x < i && i < child.getBounds().getPoint().x+child.getBounds().getWidth() && child.getBounds().getPoint().y < j && j < child.getBounds().getPoint().y+child.getBounds().getHeight()){
//            if(child.getBounds().getPoint().x < i && i < child.getBounds().getPoint().x+child.getBounds().getWidth()){
               if(child.getCommand() != null){
                   return child;
               }
            }
            ret = child.find(i,j);
        }
        return ret;
    }
}
