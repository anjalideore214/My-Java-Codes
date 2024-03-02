import java.awt.Color;
import javax.swing.*;
public class ColorCode extends JFrame{
    ColorCode(){
        setSize(300,300);
        getContentPane().setBackground(new Color(255, 0, 0));
        setVisible(true);
    }
    public static void main(String args[]){
        new ColorCode();
    }
    }
