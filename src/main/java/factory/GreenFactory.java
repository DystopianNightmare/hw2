/*
implements the  factory method and singleton
 */
package factory;

import glyph.Compositor;
import glyph.Glyph;
import glyph.NoChildOperationsException;

class GreenFactory extends WidgetFactory {


    private static GreenFactory greenFactory;
    private GreenFactory(){
        super();
    };

    public static GreenFactory getInstance() {
        if(greenFactory == null) {
            greenFactory = new GreenFactory();
        }
        return greenFactory;
    }

    public Button getButton(Compositor compositor, Glyph g) throws NoChildOperationsException {
        return new GreenButton(compositor, g);
    }
    public Label getLabel(Compositor compositor, Glyph g) throws NoChildOperationsException {

        return new GreenLabel(compositor, g);
    }

}