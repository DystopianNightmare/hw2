package factory;

import factory.Button;
import glyph.Glyph;
import window.Window;

 class RedButton extends Button {

     String testy = "test";
     RedButton(){
        // draw button?

    }


    public void draw(Window window) {
        window.drawButton(10,10,20,20,"red");
    }
}
