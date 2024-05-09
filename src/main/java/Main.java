import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Main {
    public static void main(String[] args) {
        // Kreiranje instance Motocikla
        System.out.println("Hello World!!");

        JFrame frame = new JFrame("Point Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(20, 20);

        // Create a Point object at coordinates (100, 100)
        Point point = new Point(4, 13);

        // Add a custom JPanel to the JFrame for drawing
        frame.add(new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw the point
                point.draw(g);
            }
        });

        // Display the frame
        frame.setVisible(true);
    }

    }

