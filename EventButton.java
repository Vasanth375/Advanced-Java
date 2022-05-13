//import java.applet.Applet;
import java.awt.*;
import java.applet.*;
/**
 * EventButton
 */
public class EventButton extends Applet{

    public void paint(Graphics g){
        g.drawString("Hello Java", 20, 30);
        setVisible(true);
    }
    // public static void main(String[] args) {
    //     EventButton et = new EventButton();
    // }
}
/*
<applet code="EventButton.class" width=300 height=200> </applet>
*/