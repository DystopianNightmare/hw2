package command;

import java.util.ArrayList;

public class CommandHistory {

    private ArrayList<Command> list;
    private int index;

    public CommandHistory(){
        index=0;
        list = new ArrayList<Command>();
    }

    public void add(Command command, char c){
        if(c != 'u' && c != 'r') {
//            for(int i = index; i < historyLength(); i++){
//                list.remove(i);
//            }
            list.add(index, command);
            index++;
        }
    }
    public Command getCommand(int i){
        return list.get(i);
    }
    public int getIndex(){
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public int historyLength(){
        return list.size();
    }
}
