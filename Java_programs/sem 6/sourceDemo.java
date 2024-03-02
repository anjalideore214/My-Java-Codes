import java.awt.*;
import java.awt.event.*;

// import javax.xml.transform.Source;
class sourceDemo{
    /**
     * @param args
     */
    public static void main(String args[]){
        Frame frame=new Frame();
        Button button=new Button("My Button");
        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                Object source=e.getSource();
                if(source instanceof Component){
                    Component comp=(Component) source;
                    System.out.println("Mouse Clicked at"+comp);
                }
            }
        });
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}