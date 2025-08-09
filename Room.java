import java.util.Scanner;
class Room {
  public double l;
  public double w;
  public double h;

  public void setDimensions() {
  	Scanner sc=new Scanner(System.in);
  System.out.println("Enter Length: ");
  l=sc.nextDouble();
  System.out.println("Enter Width: ");
    w=sc.nextDouble();
  System.out.println("Enter height: ");
    h=sc.nextDouble();
}

  public double calculateArea() {
    return 2 *((l + w )* h);
  }

  public double calculateVolume() {
    return l * w * h;
  }
}

class Main {
  public static void main(String[] args) {
    Room r = new Room();
    r.setDimensions();
    System.out.println("The area of the room is: " + r.calculateArea());
    System.out.println("The volume of the room is: " + r.calculateVolume());
  }
}

