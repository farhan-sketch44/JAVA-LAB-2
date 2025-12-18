import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;    // area of rectangle[web:29]
    }
}
