public class Character extends Glyph {

    private char aChar;

    public Character(char aChar) {
        this.aChar = aChar;

    }

    @Override
    void draw(Window window) {
        window.drawCharacter(aChar, getBounds().getPoint().x, getBounds().getPoint().y);
    }

    @Override
    void setSize(Window window) {
        super.getBounds().setHeight(window.charHeight(aChar));
        super.getBounds().setWidth(window.charWidth(aChar));
    }

}
