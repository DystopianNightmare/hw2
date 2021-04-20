package command;

import bridge.WindowImp;

public abstract class Command implements Cloneable {

    public void Execute(){}
    public int getState(){ return 0;}
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
