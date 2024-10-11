package practice4;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

// Enum for color
enum Color {
    RED, GREEN, BLUE, YELLOW, BLACK
}

// Abstract class Shape
abstract class Shape {
    protected int position;
    protected Color color;

    public Shape(int position, Color color) {
        this.position = position;
        this.color = color;
    }

    // Abstract method to draw the shape
    public abstract void draw(Graphics g);

    // Convert custom Color to AWT Color
    protected java.awt.Color convertColor() {
        return switch (color) {
            case RED -> java.awt.Color.RED;
            case GREEN -> java.awt.Color.GREEN;
            case BLUE -> java.awt.Color.BLUE;
            default -> java.awt.Color.BLACK;
        };
    }
}

// Circle class extending Shape
class Circle extends Shape {
    private final double radius;

    public Circle(int position, Color color, double radius) {
        super(position, color);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(convertColor());
        // Drawing a circle at position with radius
        g.fillOval(position, position, (int) radius * 2, (int) radius * 2);
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private final double width, height;

    public Rectangle(int position, Color color, double width, double height) {
        super(position, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(convertColor());
        // Drawing a rectangle at position with width and height
        g.fillRect(position, position, (int) width * 10, (int) height * 10);
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    private final double base, height;

    public Triangle(int position, Color color, double base, double height) {
        super(position, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(convertColor());
        // Drawing a triangle at position
        int[] xPoints = {position, position + (int) base * 5 / 2, position - (int) base * 5 / 2};
        int[] yPoints = {position, position + (int) height * 5, position + (int) height * 5};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
// Custom JPanel for drawing shapes
class ShapePanel extends JPanel {
    private final Vector<Shape> shapes;

    public ShapePanel(Vector<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}



