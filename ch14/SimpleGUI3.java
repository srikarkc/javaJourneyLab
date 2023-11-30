import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class SimpleGUI3 implements ActionListener {
    private JFrame frame;
    public static void main(String[] args) {
        SimpleGUI3 gui = new SimpleGUI3();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button = new JButton("Change colors!");
        button.addActionListener(this);

        // Draw Panel
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}

class MyDrawPanel extends JPanel {
    public void paintCompenent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color startColor = new Color(red, green, blue);
        
        red = random.nextInt(256);
        green = random.nextInt(256);
        blue = random.nextInt(256);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
}
