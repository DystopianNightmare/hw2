package factory;
//factory method
// Singleton(127): Singleton

import bridge.AwtWindow;
import bridge.SwingWindow;
import bridge.WindowImp;
import window.Window;

public class AwtFactory extends WindowFactory{

    private static AwtFactory awtFactory;

    public static AwtFactory getInstance() {
        if(awtFactory == null) {
            awtFactory = new AwtFactory();
        }
        return awtFactory;
    }
    private AwtFactory(){
        super();
    };

    @Override
    public WindowImp getWindowInstance(String s, Window w){
        return new AwtWindow(s,w);
    }
}