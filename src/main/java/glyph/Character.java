package glyph;
import visitor.GlyphVisitor;
import window.*;
import glyph.Glyph;

public class Character extends Glyph {

    private char aChar;

    public Character(char aChar) {
        this.aChar = aChar;

    }

    @Override
   public void draw(Window window) {
        window.drawCharacter(aChar, getBounds().getPoint().x, getBounds().getPoint().y);
    }

    @Override
    void setSize(Window window) {
        super.getBounds().setHeight(window.getWindowImp().charHeight(aChar));
        super.getBounds().setWidth(window.getWindowImp().charWidth(aChar));
    }
    public void accept(GlyphVisitor v){
        v.visit(this);
    }
    public char getChar() {
        return aChar;
    }
}
