package iterator;

import java.util.List;

public class ArrayListIterator extends Iterator{
private List<glyph.Glyph> list;
private int index;
    public ArrayListIterator(List list){
        this.list = list;
        index=0;
    }
    public void first(){index=0; }
    public void next(){index++;}
    public boolean isDone(){return index >= list.size(); }
    public glyph.Glyph currentItem(){return list.get(index); }
}
