import javax.swing.*;

class displayinfo extends JFrame {
    displayinfo() {
        super("Displaying Information");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // JFrame f = new JFrame();
        JPanel p = new JPanel();
        JLabel l=new JLabel("This is Textfield");
        JTextField JT = new JTextField("TYBSC");
        // f.getContentPane();
        p.add(l);
        p.add(JT);
        add(p);
        pack();
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String args[]) {
        new displayinfo();
    }
}
