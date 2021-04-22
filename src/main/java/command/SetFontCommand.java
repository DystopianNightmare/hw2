package command;

import window.Window;

public class SetFontCommand extends Command {

    private Window window;
    private int state;
    private int size;

    public SetFontCommand(Window window){
        this.window=window;
    }
    public SetFontCommand(Window window, int size){
        this.window=window;
        this.size=size;
    }

    public void Execute() {
        state = window.getWindowImp().getFontSize();
        window.getWindowImp().setFontSize(size);
    }

    public int getState() {
        return state;
    }
}

