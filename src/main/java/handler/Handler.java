package handler;

public abstract class Handler {

    private Handler successor;
    private int topic;

    public Handler(){
        successor = null;
        topic = -1;

    }
    public boolean hasHelp(){return topic != -1;}
//    public void handleRequest(){}

    public void setHandler(Handler successor, int topic){
        this.successor = successor;
        this.topic= topic;
    }
    public void handleHelp(){
        if(successor != null){
            successor.handleHelp();
        }
    }

}
