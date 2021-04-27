package command;

import window.Window;

public class WordCommand extends Command {

    private Window window;
    private int state;

    public WordCommand(Window window){
        this.window=window;
    }

    public void Execute() {
        state = window.getWindowImp().getFontSize();
        window.getWindowImp().setFontSize(window.getWindowImp().getFontSize()+1);
    }
    public int getState() { return state; }
}
