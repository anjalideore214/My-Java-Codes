import javax.swing.*;

class ComboBox {
    /**
     * @param args
     */
    public static void main(String args[]) {
        JFrame f = new JFrame("This is Sample Code for creating ComboBox");
        f.setSize(500, 500);
        JPanel p = new JPanel();
        JComboBox<String> cb = new JComboBox<>();
        cb.addItem("Python");
        cb.addItem("C++");
        cb.addItem("Java");
        cb.addItem("C#");
        cb.addItem("AngularJS");
        cb.addItem("NodeJS");
        JComboBox<String> dd = new JComboBox<>();
        dd.addItem("Python");
        dd.addItem("C++");
        dd.addItem("Java");
        dd.addItem("C#");
        dd.addItem("AngularJS");
        dd.addItem("NodeJS");
        JComboBox<String> bb = new JComboBox<>();
        bb.addItem("Python");
        bb.addItem("C++");
        bb.addItem("Java");
        bb.addItem("C#");
        bb.addItem("AngularJS");
        bb.addItem("NodeJS");
        JComboBox<String> aa = new JComboBox<>();
        aa.addItem("Python");
        aa.addItem("C++");
        aa.addItem("Java");
        aa.addItem("C#");
        aa.addItem("AngularJS");
        aa.addItem("NodeJS");
        p.add(cb);
        p.add(dd);
        p.add(bb);
        p.add(aa);
        f.add(p);
        f.setVisible(true);

    }
}