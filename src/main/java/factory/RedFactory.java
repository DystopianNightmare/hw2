package factory;

import glyph.Compositor;
import glyph.Glyph;
import glyph.SimpleCompositor;
import window.Window;

 class RedFactory extends WidgetFactory {


    private static RedFactory redFactory;
    private RedFactory(){
        super();
    };

    public static RedFactory getInstance() {
        if(redFactory == null) {
            redFactory = new RedFactory();
        }
        return redFactory;
    }

    public Button getButton() {
        return new RedButton();
    }
     public Label getLabel(Compositor compositor){

         return new RedLabel(compositor);
     }

}
