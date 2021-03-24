import glyph.*;
import glyph.Character;
import window.*;

import java.util.Map;
import java.util.Properties;

public class main {

    public static void main(String[] args) throws NullChildException, NoChildOperationsException {



String t = System.getenv("LexiWidget");

        SwingWindow swingWindow = new SwingWindow("TEST");
        Column main = new Column(new SimpleCompositor(swingWindow));
        Column col = new Column(new SimpleCompositor(swingWindow));
        Embellishment border;
        Row row1 = new Row("This is a",new SimpleCompositor(swingWindow));
        Row row2 = new Row("border demonstration.",new SimpleCompositor(swingWindow));
        Row row3 = new Row("scroller too!",new SimpleCompositor(swingWindow));

        Embellishment scrollbar;

        Column column1 = new Column(new SimpleCompositor(swingWindow));
        Row topRow = new Row(new SimpleCompositor(swingWindow));
        Row bottomRow = new Row(new SimpleCompositor(swingWindow));


        main.insert(topRow,0);
        main.insert(bottomRow,1);

        glyph.Character a = new glyph.Character('a');
        topRow.insert(a, 0);
        Rectangle rectangle = new Rectangle(15,10);
        topRow.insert(rectangle,1);

        topRow.insert(column1,2);

        col.insert(row1,0);
        col.insert(row2,1);
        col.insert(row3,2);

//        scrollbar.insert(col,0);
//        border.insert(scrollbar,0);
        border = new Border(3,new SimpleCompositor(swingWindow), col);
        scrollbar = new Scrollbar(new SimpleCompositor(swingWindow),border);
        Embellishment border1 = new Border(3,new SimpleCompositor(swingWindow), scrollbar);
        Embellishment border2 = new Border(3,new SimpleCompositor(swingWindow), border1);
        topRow.insert(border2,3);

//        scrollbar = new glyph.Scrollbar(new glyph.SimpleCompositor(swingWindow),col);
//        border = new glyph.Border(3,new glyph.SimpleCompositor(swingWindow), scrollbar);
//        topRow.insert(border,3);

//        topRow.insert(border,3);
//        border.insert(col,0);
//        scrollbar.insert(border,0);
//        topRow.insert(scrollbar,3);
        glyph.Character B = new Character('B');
        topRow.insert(B,4);

//        glyph.Character x = new glyph.Character('x');
//        bottomRow.insert(x, 0);
//        glyph.Rectangle rectangle1 = new glyph.Rectangle(10,15);
//        bottomRow.insert(rectangle1,1);
//        glyph.Character y = new glyph.Character('y');
//        bottomRow.insert(y, 2);
//        topRow.remove(B);
//        scrollbar.remove(col);
//        topRow.remove(border);

        swingWindow.setContents(main);
    }
}