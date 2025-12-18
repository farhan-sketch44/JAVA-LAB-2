import java.util.Scanner;

class Rectangle {
    // data members
    double length;
    double breadth;
    double area;
    double perimeter;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
        // do not close Scanner tied to System.in here in small programs
    }

    void calculate() {
        area = length * breadth;                 // area of rectangle[web:27]
        perimeter = 2 * (length + breadth);      // perimeter of rectangle[web:27]
    }

    void display() {
        System.out.println("Area of rectangle = " + area);
        System.out.println("Perimeter of rectangle = " + perimeter);
    }

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    Rectangle() {}
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.read();
        r1.calculate();
        r1.display();

        Rectangle r2 = new Rectangle(10, 5);  // length = 10, breadth = 5[web:38]
        r2.calculate();
        r2.display();
    }
}
