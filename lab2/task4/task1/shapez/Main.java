package task1.shapez;

public class Main{
    public static void main(String[] args)
    {
        Shape3D cylinder = new Cylinder(5, 7);
        System.out.println("Cylinder:");
        System.out.println(cylinder.volume());
        System.out.println(cylinder.surfaceArea());

        Shape3D sphere = new Sphere(6);
        System.out.println("Sphere:");
        System.out.println(sphere.volume());
        System.out.println(sphere.surfaceArea());

        Shape3D cube = new Cube(4);
        System.out.println("Cube:");
        System.out.println(cube.volume());
        System.out.println(cube.surfaceArea());
    }
}
