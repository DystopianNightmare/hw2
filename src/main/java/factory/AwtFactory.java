package factory;

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

    public WindowImp getWindow(String s, Window w){
        return new AwtWindow(s,null);
    }
}