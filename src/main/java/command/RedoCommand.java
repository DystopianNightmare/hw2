package command;

import bridge.WindowImp;

public class RedoCommand implements Command{
    private WindowImp windowImp;
    private int state;

    public RedoCommand(WindowImp windowImp){
        this.windowImp=windowImp;
    }

    public void Execute() {
//        state = windowImp.getFontSize();
        windowImp.setFontSize(windowImp.getFontSize()-1);
    }
}
