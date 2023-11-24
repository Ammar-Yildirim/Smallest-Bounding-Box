/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

import java.util.Comparator;

/**
 * The Point class represents a point in a two-dimensional Cartesian coordinate system.
 * It stores the X and Y coordinates of the point and provides methods to access them.
 *
 * @author Ammar
 */
public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    } 
}

/**
 * The SortPointsByX class is an implementation of the Comparator interface
 * for comparing Point objects based on their X-coordinate values.
 * It provides a compare method that compares two Point objects by their X-coordinates.
 * This class can be used to sort a collection of Point objects in ascending order
 * of their X-coordinates, or with stream().min()/.max() to obtain the Point
 * with the minimal or maximal X coordinate
 *
 * @param <Point> the type of objects to be compared, which should be Point objects
 * @author Ammar
 */

class SortPointsByX implements Comparator<Point>{
    @Override
    public int compare(Point a, Point b){
        return Double.compare(a.getX(),b.getX());
    }
}
/**
 * The SortPointsByY class is an implementation of the Comparator interface
 * for comparing Point objects based on their X-coordinate values.
 * It provides a compare method that compares two Point objects by their Y-coordinates.
 * This class can be used to sort a collection of Point objects in ascending order
 * of their X-coordinates, or with stream().min()/.max() to obtain the Point
 * with the minimal or maximal Y coordinate
 *
 * @param <Point> the type of objects to be compared, which should be Point objects
 * @author Ammar
 */
class SortPointsByY implements Comparator<Point>{
    @Override
    public int compare(Point a, Point b){
        return Double.compare(a.getY(),b.getY());
    }
}
