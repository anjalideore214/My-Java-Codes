import java.awt.*;
import javax.swing.*;
class text extends JFrame{
text(){
super("Text AND Fonts");
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c=getContentPane();
mypanel p1=new mypanel();
c.add(p1);
setSize(500,500);
setContentPane(c);
}
class mypanel extends JPanel{
public void paintComponent(Graphics g){
Font f=new Font("Times New Roman",Font.BOLD,20);
g.setFont(f);
g.drawString("Demo of Text and Fonts",30,40);
}
}
}
class textfonts{
public static void main(String args[]){
new text();
}
}
