package ua.mytest;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("World");
    hello("user");

    Square s = new Square(5);
    System.out.println("The area of square with side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(5, 7);
    System.out.println("The area of rectangle with sides " + r.a + " and " + r.b + " = " + r.area());

    Point p = new Point();
    Point p1 = new Point(1, -10);
    Point p2 = new Point(1, 7);
    System.out.println("Distance between points with coordinates (" + p1.x + ", " + p1.y + ") and ("  + p2.x + ", " + p2.y + ")" +  " = " + p.distance(p1, p2));
    System.out.println("Distance between points with coordinates (" + p1.x + ", " + p1.y + ") and ("  + p2.x + ", " + p2.y + ")" +  " = " + p1.distance(p2));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

//  public static double distance(Point p1, Point p2){
//    return (Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2)));
//  }
}