package command;

import bridge.WindowImp;

public class DecrementCommand implements Command {
    private WindowImp windowImp;

    public DecrementCommand(WindowImp windowImp){
        this.windowImp=windowImp;
    }

    public void Execute() {
        windowImp.setFontSize(windowImp.getFontSize()-1);
    }
}
