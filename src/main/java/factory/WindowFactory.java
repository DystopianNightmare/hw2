package factory;

import bridge.WindowImp;
import window.Window;

public abstract class WindowFactory  {

    private static WindowFactory factory;

    public WindowFactory(){}        //make protected?

    public static WindowFactory getInstance() {


        String type = System.getenv("LexiWindow");
        if(factory != null){
            return factory;
        }
        if(type != null &&  type.equalsIgnoreCase("Awt")){
            factory =  AwtFactory.getInstance();
            return factory;
        }
        factory =  SwingFactory.getInstance();
        return factory;
    }
    public WindowImp getWindow(String s, Window w){
        return factory.getWindow(s, w);
    }
}
