package factory;

class GreenFactory extends WidgetFactory {


    private static GreenFactory greenFactory;

    private GreenFactory() {
        super();
    }

    ;

    public static GreenFactory getInstance() {
        if (greenFactory == null) {
            greenFactory = new GreenFactory();
        }
        return greenFactory;
    }

    public Button getButton() {
        return new GreenButton();
    }
    public Label getLabel(){
        return new GreenLabel();
    }
}