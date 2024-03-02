import java.awt.*;
import javax.swing.*;
class GeometricShapes{
public GeometricShapes(){
JFrame frame=new JFrame("Geometric shapes");
frame.setSize(500,500);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel DrawingPanel=new JPanel(){
public void paintComponent(Graphics g){
super.paintComponent(g);
g.fillOval(50,50,100,100);
g.drawLine(200,50,300,150);
Color c=new Color(250,50,100);
g.setColor(c);
g.fillRect(50,200,100,100);
}
};
frame.add(DrawingPanel);
frame.setVisible(true);
}
public static void main(String[] args){
new GeometricShapes();
}
}
