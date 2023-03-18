import javax.swing.*;
import java.awt.*;

public class LearnSwing {
    public static void main(String args[]){
        JFrame frame=new JFrame();

        frame.setTitle("Introduction");
        frame.setLocation(200,200);
        frame.setSize(800,600);

        //set the background of contentPane to black
        frame.getContentPane().setBackground(Color.black);

        //set the header to blackish
        frame.setBackground(Color.black);

        //By default, visibility of frame is false
        frame.setVisible(true);

        //Whenever we hit x on app, the execution of app should stop. To enable this, we use below instruction
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }}
