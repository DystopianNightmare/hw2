package factory;

import bridge.SwingWindow;
import bridge.WindowImp;
import window.Window;

public class SwingFactory extends WindowFactory{

    private static SwingFactory swingFactory;

    public static SwingFactory getInstance() {
        if(swingFactory == null) {
            swingFactory = new SwingFactory();
        }
        return swingFactory;
    }
    private SwingFactory(){
        super();
    };

    public WindowImp getWindow(String s, Window w){
        return new SwingWindow(s,w);
    }
}
