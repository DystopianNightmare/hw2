package visitor;

import glyph.Character;
import glyph.Glyph;

import java.util.ArrayList;
import java.util.List;

public class WordVisitor extends GlyphVisitor {

    private String tmp = "";
    private List<String> list = new ArrayList<String>();
    private int index=0;
    private Glyph parent = null;

    public void visit(Character character){
    if(character.getParent() == parent){
        if(character.getChar() == ' '){
            list.remove(tmp);
            list.add(tmp);
            tmp = "";
        }else{
            list.remove(tmp);
            tmp = tmp + character.getChar();
            list.add(tmp);
        }
    }else{
        tmp = "" + character.getChar();
        list.add(tmp);
    }
    parent=character.getParent();
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("");
        for(String string:list){
            stringBuilder.append(string + '\n');
        }
        return stringBuilder.toString();

        }
    }

