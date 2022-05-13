package Java.AWT;
import java.awt.*;
/**
 * ExtendsFrame
 */
public class ExtendsFrame extends Frame {

    public static void main(String[] args) {
        ExtendsFrame f = new ExtendsFrame();
        Label j = new Label("This is a Label");

        f.add(j);
        f.setTitle("title");
        f.setSize(300, 300);
        f.setVisible(true);
    }
}