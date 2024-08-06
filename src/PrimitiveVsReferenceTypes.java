import java.awt.*;

public class PrimitiveVsReferenceTypes {
    public static void main(String[] args) {
        // Primitive type example
        int x = 1;
        int y = x;
        x = 2;
        System.out.println(y); // Output will be 1

        // Reference type example
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2.x); // Output will be 2
    }
}
