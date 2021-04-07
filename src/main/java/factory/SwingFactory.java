package factory;
//factory method
// Singleton(127): Singleton

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
    private SwingFactory(){ }

    @Override
    public WindowImp getWindowInstance(String s, Window w){
        return new SwingWindow(s,w);
    }
}
