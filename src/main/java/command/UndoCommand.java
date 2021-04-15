package command;

import bridge.WindowImp;

public class UndoCommand implements Command{
    private WindowImp windowImp;

    public UndoCommand(WindowImp windowImp){
        this.windowImp=windowImp;
    }

    public void Execute() {
        windowImp.setFontSize(windowImp.getFontSize()-1);
    }
}
