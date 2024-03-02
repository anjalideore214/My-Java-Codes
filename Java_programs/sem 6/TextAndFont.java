import java.awt.*;
import javax.swing.*;
public class TextAndFont extends JFrame {
    TextAndFont(){
        setSize(500,400);
        setVisible(true);
        setTitle("Text and Fonts");
        Container c=getContentPane();
        mypanel p=new mypanel();
        c.add(p);
        setContentPane(c);
    }
        class mypanel extends JPanel {
              public void paintComponent(Graphics g){
                Font f= new Font("Sans Sarif",Font.BOLD,26);
                g.setFont(f);
                g.drawString("Displaying Demo of Text and Fonts",20,30);
              }
        }
    
    public static void main(String[] args) {
        new TextAndFont();
    }
}
