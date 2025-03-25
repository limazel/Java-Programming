import java.util.Arrays;

public class TestLine {
    public static void main(String[] args) {


        // Test constructors and toString()
        Line l1 = new Line(1,2,3,4);
        System.out.println(l1);

        Line l2 = new Line(5,6,7,8);
        System.out.println(l2);

        // Test Setters and Getters
        l1.setBegin(new Point(11,12));
        l1.setEnd(new Point(13,14));
        System.out.println(l1);
        System.out.println("Begin is: " + l1.getBegin());
        System.out.println("End is: " + l1.getEnd());

        l1.setBeginX(21);
        l1.setBeginY(22);
        l1.setEndX(23);
        l1.setEndY(24);
        System.out.println(l1);
        System.out.println("begin's x is: " + l1.getBeginX());
        System.out.println("begin's y is: " + l1.getBeginY());
        System.out.println("end's x is: " + l1.getEndX());
        System.out.println("end's y is: " + l1.getEndY());

        l1.setBeginXY(31, 32);
        l1.setEndXY(33, 34);
        System.out.println(l1); 

        System.out.println("begin's x and y are: " + Arrays.toString(l1.getBeginXY()));
        System.out.println("end's x and y are: " + Arrays.toString(l1.getEndXY()));

        System.out.printf("length is: %.2f%n", l1.getLength());





         // Test gradient calculation
         try {
            System.out.printf("Gradient: %.2f%n", l1.getGradient());
        } catch (ArithmeticException e) {
            System.out.println("Gradient Error: " + e.getMessage());
        }

        // Test distance calculations
        System.out.printf("Distance to point (35, 36): %.2f%n", l1.distance(35, 36));
        System.out.printf("Distance to point (31, 32): %.2f%n", l1.distance(new Point(31, 32)));

        // Test intersection
        Line l3 = new Line(0, 0, 4, 4);
        Line l4 = new Line(0, 4, 4, 0);
        System.out.println("Lines intersect: " + l3.intersects(l4));

        Line l5 = new Line(5, 5, 7, 7);
        System.out.println("Lines intersect: " + l3.intersects(l5));

    }
}
