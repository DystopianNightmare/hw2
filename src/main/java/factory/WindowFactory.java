package factory;
// AbstractFactory(87): AbstractFactory
// Singleton(127): Singleton
// FactoryMethod(107): Creator

import bridge.WindowImp;
import window.Window;

public abstract class WindowFactory  {

    private static WindowFactory factory;

    protected WindowFactory(){}        //make protected?

    public static WindowFactory getInstance() {
        String type = System.getenv("LexiWindow1");
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
     public abstract WindowImp getWindowInstance(String s, Window w) ;

    public WindowImp getWindow(String s, Window w){
        return factory.getWindowInstance(s, w);
    }
}
