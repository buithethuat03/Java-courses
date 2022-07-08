package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame{
    MyFrame()
    {
        
        this.setTitle("Hello World");//set title of frame

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application

        this.setResizable(false);//prevent frame from being resizable

        this.setSize(400,400);//set the x-dimension and y-dimension of frame

        this.setVisible(true);//make frame visible

        ImageIcon image = new ImageIcon("2048.png");//create an ImageIcon

        this.setIconImage(image.getImage());//change icon of frame

        this.getContentPane().setBackground(new Color(127,128,127));//change color of background
    }
}
