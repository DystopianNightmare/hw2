package window;
import bridge.WindowImp;
import factory.WindowFactory;
import glyph.*;

public abstract class Window {

    protected WindowImp windowImp;
    private Glyph g;
    public WindowImp getWindowImp(){ return windowImp;}

    public Window(){
        WindowFactory windowFactory = WindowFactory.getInstance();
        windowImp = windowFactory.getWindow("test",this);
    }

    public void drawCharacter(char c, int x, int y) {
        windowImp.drawCharacter(c,x,y);
    }

    public void drawRectangle(int x, int y, int width, int height){
        windowImp.drawRectangle(x,y,width,height);
    }

    public int charWidth(char c) {
        return windowImp.charWidth(c);
    }

    public int charHeight(char c){
        return windowImp.charHeight(c);
    }

    public void setContents(){
        windowImp.setContents();
    }

    public void addBorder(int x1, int y1, int x2, int y2, int width){
        windowImp.addBorder(x1,y1,x2,y2,width);
    }
    public void addScrollBar(int x, int y, int width, int height){
        windowImp.addScrollBar(x,y,width,height);
    }

    public void drawButton(int x, int y, int width, int height, String color){
        windowImp.drawButton(x,y,width,height,color);
    }
    public void drawLabel(int x, int y, int width, int height, String color){
        windowImp.drawLabel(x,y,width,height,color);
    }
    public void setRoot(Glyph g){ this.g=g;}

    public void draw() {
       Glyph root = g;
        while (root.getParent() != null) {
            root = root.getParent();
        }
        root.draw(this);
    }
}
