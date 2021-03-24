package factory;

import glyph.Compositor;
import glyph.Glyph;
import glyph.NoChildOperationsException;
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

    public Button getButton(Compositor compositor, Glyph g) throws NoChildOperationsException {
        return new RedButton(compositor, g);
    }
     public Label getLabel(Compositor compositor, Glyph g) throws NoChildOperationsException {
         return new RedLabel(compositor, g);
     }

}
