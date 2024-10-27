package task1.shapez;

public class Cylinder extends Shape3D {
    private double radius, height;
    public Cylinder(double r, double h) {
    this.radius = r;
    this.height = h;
    }
    @Override
    public double volume() {
    return Math.PI * radius * radius * height;
        }
    public double surfaceArea()
    {
        return 2 * Math.PI * radius * height + 2 * (Math.PI * radius * radius);
    }
// continue
}