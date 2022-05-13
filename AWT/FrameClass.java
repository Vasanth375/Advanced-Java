package Java.AWT;
import java.awt.*;


/**
 * FrameClass
 */
public class FrameClass {

    FrameClass(){
        Frame  f = new Frame();
        Label l = new Label("String");
        f.add(l );
        f.setTitle("title");
        f.setVisible(true);
    }

    public static void main(String[] args) {
        FrameClass f = new FrameClass();
    }
}