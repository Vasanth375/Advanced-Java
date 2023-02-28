package Programs;


// import java.awt.*;
// import javax.swing.*;
// import java.awt.event.*;

// public class CountryFlags {
//     CountryFlags(){
//         JFrame jf = new JFrame("Country Flag");

//         JButton button = new JButton(new ImageIcon("https://cdn.britannica.com/97/1597-050-008F30FA/Flag-India.jpg"));
//         button.setBounds(90, 90, 200, 200);

//         JTextField textField = new JTextField();
//         textField.setBounds(20, 30, 400, 400);

//         button.addActionListener(new ActionListener() {
//             public void actionperformed(ActionEvent e){
//                 textField.setText("India");
//             }
//         });

//         jf.add(button);
//         jf.add(textField);
//         // JButton button1 = new JButton(new ImageIcon("https://cdn.britannica.com/97/1597-050-008F30FA/Flag-India.jpg"));
//         // button1.setBounds(150, 150, 400, 400);
//         // JTextField textField1 = new JTextField();

//         // button1.addActionListener(new ActionListener() {
//         //     public void actionperformed(ActionEvent e){
//         //         textField1.setText("Indiawrg");
//         //     }
//         // });

//         // jf.add(button1);jf.add(textField1);

//         // JButton button2 = new JButton(new ImageIcon("https://cdn.britannica.com/97/1597-050-008F30FA/Flag-India.jpg"));
//         // button2.setBounds(200, 200, 100, 100);
//         // JTextField textField2 = new JTextField();

//         // button2.addActionListener(new ActionListener() {
//         //     public void actionperformed(ActionEvent e){
//         //         textField2.setText("Indiaefwrg");
//         //     }
//         // });

//         // jf.add(button2);jf.add(textField2);
//         // jf.setVisible(true);
//         // jf.setSize(500, 500);
        
//     }

//     public static void main(String[] args) {
//         new CountryFlags();
//     }
// }


import java.awt.event.*;  
import javax.swing.*;

public class CountryFlags {  

    public static void main(String[] args) {  
        JFrame f=new JFrame("Button Example");  

        JTextField tf=new JTextField();  
        tf.setBounds(50,50, 150,20);  

        JButton b=new JButton(new ImageIcon("C:\\Users\\VASANTH\\OneDrive\\India2.png"));  
        b.setBounds(50,100,200,200);  

        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                tf.setText("India");  
            }  
        });  

        f.add(b);
        f.add(tf);  

        JTextField tf1 = new JTextField();
        tf1.setBounds(200, 50, 150, 30);

        JButton b1 = new JButton(new ImageIcon("C:\\Users\\VASANTH\\OneDrive\\America.png"));
        b1.setBounds(250, 80, 200, 200);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tf1.setText("America");
            }
        });

        f.add(b1);
        f.add(tf1);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }  
} 