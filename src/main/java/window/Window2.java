package window;

import bridge.WindowImp;
import factory.WindowFactory;

public class Window2 extends Window {

    public Window2(){
        WindowFactory windowFactory = WindowFactory.getInstance();
        windowImp = windowFactory.getWindow("test",this);
    }
}
