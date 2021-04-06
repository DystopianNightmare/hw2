import bridge.SwingWindow;
import bridge.WindowImp;
import factory.*;
import glyph.*;
import window.Window;
import window.Window2;

public class main {

    public static void main(String[] args) throws NullChildException, NoChildOperationsException {
//        SwingWindow swingWindow = new SwingWindow("TEST");


        Window window = new Window2();
        WindowImp windowImp = window.getWindowImp();
        Column main = new Column(new SimpleCompositor(window));
        window.setRoot(main);


        Embellishment scrollbar = new Scrollbar(new SimpleCompositor(window),main);
        Embellishment border = new Border(5, new SimpleCompositor(window),scrollbar);
        Column subMain = new Column(new SimpleCompositor(window));
        Row topRow = new Row(new SimpleCompositor(window));
        Row middleRow = new Row(new SimpleCompositor(window));
        Row bottomRow = new Row(new SimpleCompositor(window));
        Row buttonRow = new Row("PQ",new SimpleCompositor(window));
        Row labelRow = new Row("pq",new SimpleCompositor(window));
        Column column = new Column(new SimpleCompositor(window));

        WidgetFactory widgetFactory = WidgetFactory.getInstance();
        Label label = widgetFactory.getLabel(new SimpleCompositor(window),labelRow);
        Button button = widgetFactory.getButton(new SimpleCompositor(window), buttonRow);




        column.insert(new glyph.Character('X'),0);
        column.insert(label,1);
        column.insert(new glyph.Character('Z'),2);

        topRow.insert(new glyph.Character('a'),0);
        topRow.insert(new Rectangle(20,10),1);
        topRow.insert(column, 2);
        topRow.insert(new glyph.Character('b'),3);

        middleRow.insert(new glyph.Character('x'),0);
        middleRow.insert(new Rectangle(10,20), 1);
        middleRow.insert(new glyph.Character('y'),2);

        bottomRow.insert(new glyph.Character('P'),0);
        bottomRow.insert(new glyph.Character('Q'),1);

        subMain.insert(topRow,0);
        subMain.insert(middleRow,1);
        subMain.insert(button,2);
        main.insert(subMain, 0);

//        window.setContents(main);
        window.getWindowImp().setContents();
    }
}




//        main.insert(new glyph.Character('a'), 0);

//        Column main = new Column(new SimpleCompositor(swingWindow));
//        Column col = new Column(new SimpleCompositor(swingWindow));
//        Row row1 = new Row("This is a",new SimpleCompositor(swingWindow));
//        Row row2 = new Row("border demonstration.",new SimpleCompositor(swingWindow));
//        Row row3 = new Row("scroller too!",new SimpleCompositor(swingWindow));
//
//        Column column1 = new Column(new SimpleCompositor(swingWindow));
//        Row topRow = new Row(new SimpleCompositor(swingWindow));
//        Row bottomRow = new Row(new SimpleCompositor(swingWindow));
//
//        glyph.Character Q = new glyph.Character('Q');
//        glyph.Character R = new glyph.Character('R');
//        glyph.Character T = new glyph.Character('T');
//        bottomRow.insert(Q, 0);
//        bottomRow.insert(R, 1);
//        bottomRow.insert(T, 2);
//
//        WidgetFactory widgetFactory = WidgetFactory.getInstance();
//        Label label = widgetFactory.getLabel(new SimpleCompositor(swingWindow),bottomRow);
//        Button button = widgetFactory.getButton(new SimpleCompositor(swingWindow), topRow);
//
//        main.insert(label,0);
//        main.insert(button,1);
//
//        glyph.Character a = new glyph.Character('a');
//        topRow.insert(a, 0);
//        Rectangle rectangle = new Rectangle(15,10);
//        topRow.insert(rectangle,1);
//        topRow.insert(column1,2);
//
//        col.insert(row1,0);
//        col.insert(row2,1);
//        col.insert(row3,2);
//
//        Embellishment border = new Border(3,new SimpleCompositor(swingWindow), col);
//        Embellishment scrollbar = new Scrollbar(new SimpleCompositor(swingWindow),border);
//        Embellishment border1 = new Border(3,new SimpleCompositor(swingWindow), scrollbar);
//        Embellishment border2 = new Border(3,new SimpleCompositor(swingWindow), border1);
//        topRow.insert(border2,3);
//
//        glyph.Character B = new Character('B');
//        topRow.insert(B,4);

