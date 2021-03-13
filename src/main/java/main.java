public class main {

    public static void main(String[] args) throws NullChildException, NoChildOperationsException {
        SwingWindow swingWindow = new SwingWindow("TEST");
        Column main = new Column(new SimpleCompositor(swingWindow));
        Column col = new Column(new SimpleCompositor(swingWindow));
        Border border= new Border(30,new SimpleCompositor(swingWindow));
        Row row1 = new Row("This is a",new SimpleCompositor(swingWindow));
        Row row2 = new Row("border demonstration.",new SimpleCompositor(swingWindow));
        Row row3 = new Row("scroller too!",new SimpleCompositor(swingWindow));

        Scrollbar scrollbar = new Scrollbar(new SimpleCompositor(swingWindow));

        Column column1 = new Column(new SimpleCompositor(swingWindow));
        Row topRow = new Row(new SimpleCompositor(swingWindow));
        Row bottomRow = new Row(new SimpleCompositor(swingWindow));


        main.insert(topRow,0);
        main.insert(bottomRow,1);

        Character a = new Character('a');
        topRow.insert(a, 0);
        Rectangle rectangle = new Rectangle(15,10);
        topRow.insert(rectangle,1);

        topRow.insert(column1,2);

        col.insert(row1,0);
        col.insert(row2,1);
        col.insert(row3,2);

        scrollbar.insert(col,0);
        border.insert(scrollbar,0);
        topRow.insert(border,3);
//        border.insert(col,0);
//        scrollbar.insert(border,0);
//        topRow.insert(scrollbar,3);
        Character B = new Character('B');
        topRow.insert(B,4);

        Character x = new Character('x');
        bottomRow.insert(x, 0);
        Rectangle rectangle1 = new Rectangle(10,15);
        bottomRow.insert(rectangle1,1);
        Character y = new Character('y');
        bottomRow.insert(y, 2);
//        topRow.remove(B);
//        scrollbar.remove(col);
//        topRow.remove(border);

        swingWindow.setContents(main);
    }
}