public class SimpleCompositor extends Compositor {

    protected Window window;

    public SimpleCompositor(Window window) {
        this.window = window;
    }

    @Override
    public void compose() {
        Bounds cursor = new Bounds(composition);

            for (int i = 0; i < composition.getChildren().size(); i++) {
                try {
                    Glyph child = composition.child(i);
                    child.setSize(window);
                    child.getBounds().setPoint(cursor.getPoint());
                    child.compose();
                    composition.updateCursor(cursor, child);
                } catch (NullChildException e) {
                }
            }
            composition.adjustParent(cursor);
        }
    }