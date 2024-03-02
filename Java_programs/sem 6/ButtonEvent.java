import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonEvent {
    public static void main(String[] args) {
        JFrame f=new JFrame("Button Click Action");
        JPanel p=new JPanel();
        JButton b=new JButton("Click Me");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Button Clicked");
            }
        });
        f.getContentPane();
        p.add(b);
        f.add(p);
        f.setSize(400,400);
        f.setVisible(true);
    } 
}
