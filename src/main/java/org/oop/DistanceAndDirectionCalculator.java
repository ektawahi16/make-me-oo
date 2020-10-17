package org.oop;

public class DistanceAndDirectionCalculator {


    public static double distance(Point to, Point from){
        return from.getDistance(to);
    }

    public static double direction(Point to,Point from){
        return from.getDirection(to);
    }

}
