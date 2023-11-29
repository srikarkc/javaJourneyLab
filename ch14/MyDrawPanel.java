/*
 * This program won't compile. It's to depict the different ways of rendering Graphics onto a frame.
 * You do this by extending the JPanel and overriding the paintComponent() method.
 */

import java.awt.*;
import javax.swing.*;
    
public void paintComponent(Graphics g) {
    g.setColor(Color.blue);

    g.fillRect(20, 50, 100, 100);
}

public void paintComponent(Graphics g) {
    Image image = new ImageIcon("catzilla.jpg").getImage();
    g.drawImage(image, 3, 4, this);
}

// paint randomly colored circle on a black background
public void paintCompenent(Graphics g) {
    g.fillRect(0, 0, this.getWidth(), this.getHeight());

    Random random = new Random();
    int red = random.nextInt(256);
    int green = random.nextInt(256);
    int blue = random.nextInt(256);

    Color randomColor = new Color(red, green, blue);
    g.setColor(randomColor);
    g.fillOval(70, 70, 100, 100);
}

// gradient blend using Graphics2D casting
public void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);

    g2d.setPaint(gradient);
    g2d.fillOval(70, 70, 100, 100);
}