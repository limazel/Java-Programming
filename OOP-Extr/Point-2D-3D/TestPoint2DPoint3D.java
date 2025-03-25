public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        Point2D p2a = new Point2D(1,2);
        System.out.println(p2a);
        Point2D p2b = new Point2D();
        System.out.println(p2b);

        // getters and setters
        p2a.setX(3);
        p2a.setY(4);
        System.out.println("p2a X:" + p2a.getX() + "  Y:" + p2a.getY());


        /* Test POINT3D  */
        // Test Constructors and toString()
        Point3D p3a = new Point3D(11,12,13);
        System.out.println(p3a);
        Point3D p3b = new Point3D();
        System.out.println(p3b);

        p3a.setX(21);  // in superclass
        p3a.setY(22);  // in superclass
        p3a.setZ(23);  // in this class
        System.out.println(p3a);  // toString()
        System.out.println("x is: " + p3a.getX());  // in superclass
        System.out.println("y is: " + p3a.getY());  // in superclass
        System.out.println("z is: " + p3a.getZ());
    }
}
