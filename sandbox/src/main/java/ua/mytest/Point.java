package ua.mytest;

import static java.lang.Math.*;

public class Point {
   int x;
   int y;

  public Point() {
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point a, Point b) {
    return (sqrt(pow((a.x - b.x), 2) + pow((a.y - b.y), 2)));
  }

  public double distance(Point b) {
    return (sqrt(pow((x - b.x), 2) + pow((y - b.y), 2)));
  }
}
