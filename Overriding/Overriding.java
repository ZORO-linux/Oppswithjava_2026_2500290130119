class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    void area() {
        System.out.println("Circle Area = " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    @Override
    void area() {
        System.out.println("Rectangle Area = " + (length * width));
    }
}

public class Overriding {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area();
        s2.area();
    }
}