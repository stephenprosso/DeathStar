package com.codewithrosso;

import java.util.Objects;
//comparing objects
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj)
//            return true;
//        if (!(obj instanceof Point))
//            return false;
//
//            var other = (Point) obj;
//            return other.x == x && other.y == y;
//        }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x,y);
//    }
}

/*
var point1 = new Point(1, 2);
var point2 = new Point(1, 2);
System.out.println(point1 == point2);
System.out.println(point1.equals(point1));
System.out.println(point1.hashCode());
System.out.println(point2.hashCode());
*/

