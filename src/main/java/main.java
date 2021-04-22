import command.*;
import factory.*;
import glyph.*;
import window.ApplicationWindow;
import window.Window;


public class main {

    public static void main(String[] args) throws  NoChildOperationsException {

        Window window = new ApplicationWindow();
        Column main = new Column(new SimpleCompositor(window));

        CommandHistory commandHistory = CommandHistory.getInstance();
        window.setCommandHistory(commandHistory);
        KeyMap keyMap = new KeyMap();
        window.setKeyMap(keyMap);
        keyMap.put('i',new IncrementCommand(window));
        keyMap.put('d',new DecrementCommand(window));
        keyMap.put('r',new RedoCommand(window));
        keyMap.put('u',new UndoCommand(window));

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

        Row buttons = new Row(new SimpleCompositor(window));
        Row buttonPlus = new Row(" + ",new SimpleCompositor(window));
        Row buttonMinus = new Row(" - ",new SimpleCompositor(window));
        Row button14 = new Row(" 14 ",new SimpleCompositor(window));
        Row button20 = new Row(" 20 ",new SimpleCompositor(window));

        Button buttonP = widgetFactory.getButton(new SimpleCompositor(window), buttonPlus);
        Button buttonM = widgetFactory.getButton(new SimpleCompositor(window), buttonMinus);
        Button button1 = widgetFactory.getButton(new SimpleCompositor(window), button14);
        Button button2 = widgetFactory.getButton(new SimpleCompositor(window), button20);

        buttonP.setCommand(new IncrementCommand(window));
        buttonM.setCommand(new DecrementCommand(window));
        button1.setCommand(new SetFontCommand(window,14));
        button2.setCommand(new SetFontCommand(window,20));

        buttons.insert(buttonP,0);
        buttons.insert(buttonM,1);
        buttons.insert(button1,2);
        buttons.insert(button2,3);

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
        subMain.insert(buttons,3);
        main.insert(subMain, 0);

        window.setRoot(main);
        window.setContents();
    }
}