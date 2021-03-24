package factory;

import glyph.Glyph;

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
          }
          if(type.equalsIgnoreCase("GREEN")){
               factory =  GreenFactory.getInstance();
          }
          return factory;
     }

     public Button getButton() {
          return factory.getButton();

     }

     public Label getLabel() {
          return factory.getLabel();
     }
}
