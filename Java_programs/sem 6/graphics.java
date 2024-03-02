import java.awt.*;
import javax.swing.*;
class graph extends JFrame{
graph(){
super("GUI");
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c=getContentPane();
mypanel p1=new mypanel();
c.add(p1);
setSize(500,500);
setContentPane(c);
}
}
class mypanel extends JPanel{
public void paintComponent(Graphics g){
super.paintComponent(g);
g.drawString("Display Text",30,20);
}
}
class graphics{
public static void main(String[] args){
new graph();
}
}

