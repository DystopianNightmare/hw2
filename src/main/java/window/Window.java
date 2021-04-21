package window;
import bridge.WindowImp;
import command.Command;
import command.CommandHistory;
import command.IncrementCommand;
import command.KeyMap;
import factory.WindowFactory;
import glyph.*;
import handler.Handler;
import prototype.Prototype;

public abstract class Window {

    protected WindowImp windowImp;
    private Glyph g;
    public WindowImp getWindowImp(){ return windowImp;}
    private  KeyMap keyMap;
    private CommandHistory commandHistory;
    private Handler handler;

    public Window(){
        WindowFactory windowFactory = WindowFactory.getInstance();
        windowImp = windowFactory.getWindow("test",this);
//        commandIndex=0;
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
    public Glyph getRoot(){
        Glyph root = g;
        while (root.getParent() != null) {
            root = root.getParent();
        }
        return root;
    }

    public void draw() {
       Glyph root = g;
        while (root.getParent() != null) {
            root = root.getParent();
        }
        root.draw(this);
    }

    public void key(char c) {
        Command cmd = keyMap.get(c);

        if(cmd != null) {
            Command command = (Command) cmd.clone();
            commandHistory.add(command, c);
            command.Execute();
            g = getRoot();
            g.compose();
            windowImp.repaint();
        }
    }

    public void setKeyMap(KeyMap keyMap){ this.keyMap=keyMap;}
    public CommandHistory getCommandHistory() { return commandHistory; }
    public void setCommandHistory(CommandHistory commandHistory) { this.commandHistory = commandHistory; }
    public void click(int i, int j) { System.out.print("in click in window i = " + i + " and  j = " + j + "\n") ;}
    public Glyph find(){
        Glyph g = getRoot();
        for (int i = 0; i < g.; i++) {

        return null;
    }
}
