package labels;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

public class Main {
    public static void main(String[] args)
    {
        //  JLabel =    a GUI display area for a string of text, an image, of both
        ImageIcon image = new ImageIcon("2048.png");
        Border border = BorderFactory.createLineBorder(Color.orange,3);


        JLabel label = new JLabel();//create a label
        label.setText("Bro, do you even code?");//set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP);//set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(Color.green);//set color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font of text
        label.setIconTextGap(0);//set gap of text to image
        label.setBackground(Color.gray);//set background color
        label.setOpaque(true);//display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
       // label.setBounds(0, 0, 300,300);//set x,y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        
        frame.add(label);
        frame.pack();
    }
}
