package org.oop;

public class DistanceAndDirectionCalculator {


    public static double distance(Point to, Point from){
        return from.getDistance(to);
    }

    public static double direction(Point to,Point from){
        return from.getDirection(to);
    }

    public static void main(String[] args) {
        Point first = new Point(1,2);
        Point second = new Point (5,6);



        System.out.println("Distance between them = " + distance(first,second));
        System.out.println("Direction between them = " + direction(first,second));
    }

}
