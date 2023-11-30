import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class TwoButtons {
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();    
    }

    void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton();
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton();
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500, 400);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Ouch!");
        }
    }

    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
}
class MyDrawPanel extends JPanel {
    public void paintCompenent(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(20, 50, 100, 100);
        // Graphics2D g2d = (Graphics2D) g;

        // Random random = new Random();
        // int red = random.nextInt(256);
        // int green = random.nextInt(256);
        // int blue = random.nextInt(256);
        // Color startColor = new Color(red, green, blue);
        
        // red = random.nextInt(256);
        // green = random.nextInt(256);
        // blue = random.nextInt(256);
        // Color endColor = new Color(red, green, blue);

        // GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        // g2d.setPaint(gradient);
        // g2d.fillOval(70, 70, 100, 100);
    }
}
