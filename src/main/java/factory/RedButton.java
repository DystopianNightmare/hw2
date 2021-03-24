package factory;

import factory.Button;
import glyph.Bounds;
import glyph.Glyph;
import glyph.SimpleCompositor;
import window.Window;

 class RedButton extends Button {

     String testy = "test";
     RedButton(){

         // draw button?

    }


    public void draw(Window window) {
        window.drawButton(getBounds().getPoint().x, getBounds().getPoint().y,20,20,"red");
    }
}
