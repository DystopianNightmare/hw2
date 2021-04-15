package command;

import bridge.WindowImp;

public class IncrementCommand implements Command{

    private WindowImp windowImp;

    public IncrementCommand(WindowImp windowImp){
        this.windowImp=windowImp;
    }

    public void Execute() {
        windowImp.setFontSize(windowImp.getFontSize()+1);
    }
}
