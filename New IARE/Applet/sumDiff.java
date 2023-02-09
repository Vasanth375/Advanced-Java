import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class sumDiff extends Applet implements ActionListener {
  TextField num1, num2, result;
  Button btnAdd, btnSubtract;

  public void init() {
    num1 = new TextField(10);
    num2 = new TextField(10);
    result = new TextField(10);
    btnAdd = new Button("Add");
    btnSubtract = new Button("Subtract");

    add(num1);
    add(num2);
    add(btnAdd);
    add(btnSubtract);
    add(result);

    btnAdd.addActionListener(this);
    btnSubtract.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae) {
    int n1 = Integer.parseInt(num1.getText());
    int n2 = Integer.parseInt(num2.getText());
    int res = 0;

    if (ae.getSource() == btnAdd) {
      res = n1 + n2;
    } else {
      res = n1 - n2;
    }

    result.setText(Integer.toString(res));
  }
}