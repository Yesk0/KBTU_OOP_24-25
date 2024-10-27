package task1.shapez;

public class Cube extends Shape3D {
    private double side;
    public Cube(double a) {
    this.side = a;
    }
    @Override
    public double volume() {
    return side * side * side;
        }
    public double surfaceArea()
    {
        return 6 * side * side;
    }
// continue
}