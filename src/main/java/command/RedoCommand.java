package command;

import bridge.WindowImp;
import window.Window;

public class RedoCommand extends Command{
    private Window window;
    private int state;

    public RedoCommand(Window window){
        this.window=window;
    }

    public void Execute() {
        if(window.getCommandHistory().getIndex() < window.getCommandHistory().historyLength()) {

            Command cmd = window.getCommandHistory().getCommand(window.getCommandHistory().getIndex());
            cmd.Execute();
            window.getCommandHistory().setIndex(window.getCommandHistory().getIndex()+1);
//            window.getWindowImp().setFontSize(cmd.getState());

        }
    }
    public int getState() { return state; }


}
