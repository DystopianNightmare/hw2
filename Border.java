public class Border  extends Embellishment {

    private int width;

    public Border(int width){
        this.width=width;
    }


    @Override
    void draw(Window window) {
window.addBorder(getBounds().getPoint().x,getBounds().getPoint().y,getBounds().getHeight(), getBounds().getHeight(), width);
//        window.addBorder(5,50,50,110,5);
    }
}
