package factory;

import glyph.Compositor;
import glyph.*;

public abstract class WidgetFactory {

     private static WidgetFactory factory;

     WidgetFactory(){}

     public static WidgetFactory getInstance() {

          String type = System.getenv("LexiWidget2");
          if(factory != null){
               return factory;
          }
          if(type.equalsIgnoreCase("RED")){
               factory =  RedFactory.getInstance();
               return factory;
          }

          factory =  GreenFactory.getInstance();
          return factory;
     }

     public Button getButton(Compositor compositor, Glyph g) throws NoChildOperationsException {
          return factory.getButton(compositor, g);

     }

     public Label getLabel(Compositor compositor, Glyph g) throws NoChildOperationsException {
          return factory.getLabel(compositor, g);
     }
}
