import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI2 implements ActionListener {
    private JButton button;
    public static void main(String[] args) {
        SimpleGUI2 gui = new SimpleGUI2();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click Me!");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(300,300);
        frame.setVisible(true);

        // Need to tell my button to add me as an action listener
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked");
        System.out.println(e);
    }
}
