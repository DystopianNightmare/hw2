package factory;

import glyph.Compositor;
import glyph.SimpleCompositor;

public abstract class WidgetFactory {

     private static WidgetFactory factory;

     WidgetFactory(){}

     public static WidgetFactory getInstance() {

          String type = System.getenv("LexiWidget");
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

     public Button getButton() {
          return factory.getButton();

     }

     public Label getLabel(Compositor compositor) {

          return factory.getLabel(compositor);
     }
}
