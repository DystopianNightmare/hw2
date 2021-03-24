package factory;

import glyph.Glyph;
import org.omg.CORBA.Environment;

public interface  Button {

    Glyph createButton();
    Glyph createLabel();
}
