package command;

import bridge.WindowImp;
import window.Window;

public class DecrementCommand extends Command {

    private Window window;
    private int state;

    public DecrementCommand(Window window){
        this.window=window;
    }

    public void Execute() {
        state = window.getWindowImp().getFontSize();
        window.getWindowImp().setFontSize(window.getWindowImp().getFontSize()-1);
    }
    public int getState() { return state; }


}
