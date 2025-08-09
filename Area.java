import java.util.Scanner;
interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    public double width, height;
    Scanner sc=new Scanner(System.in);
    public Rectangle() {
        System.out.println("Enter Width: ");
    width=sc.nextDouble();
  System.out.println("Enter height: ");
    height=sc.nextDouble();
    }
    
   /* public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }*/
    
    public double getArea() {
        return width * height;
    }
}

class Circle implements Shape {
    public double radius;
    private final double PI = 3.14159265359;
    Scanner sc=new Scanner(System.in);
    public Circle() {
        System.out.println("Enter Radius: ");
        radius=sc.nextDouble();
    }
    
   /* public double getRadius() {
        return radius;
    }*/
    
    public double getArea() {
        return PI * radius * radius;
    }
}

 class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Rectangle area: " + r.getArea());
        Circle c = new Circle();
        System.out.println("Circle area: " + c.getArea());
    }
}

