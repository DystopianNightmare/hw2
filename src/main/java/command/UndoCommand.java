package command;

import bridge.WindowImp;
import window.Window;

public class UndoCommand extends Command{
    private Window window;
    private int state;

    public UndoCommand(Window window){
        this.window=window;
    }

    public void Execute() {
        if(window.getCommandHistory().getIndex() > 0) {
            Command cmd = window.getCommandHistory().getCommand(window.getCommandHistory().getIndex()-1);
            window.getWindowImp().setFontSize(cmd.getState());
            window.getCommandHistory().setIndex(window.getCommandHistory().getIndex() - 1);
        }

    }

    public int getState() { return state; }


}
