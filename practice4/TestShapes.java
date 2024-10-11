package practice4;

import javax.swing.*;
import java.util.Vector;

public class TestShapes {
    public static void main(String[] args) {
        // Create a vector of Shape objects
        Vector<Shape> shapes = new Vector<>();

        // Add different shapes to the vector
        shapes.add(new Circle(50, Color.RED, 100.0));
        shapes.add(new Rectangle(150, Color.BLUE, 40.0, 20.0));
        shapes.add(new Triangle(250, Color.GREEN, 40.0, 50.0));

        // Create JFrame to display shapes
        JFrame frame = new JFrame("Drawing Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Add custom JPanel that draws shapes
        ShapePanel panel = new ShapePanel(shapes);
        frame.add(panel);

        frame.setVisible(true); // Show the frame
    }
}
