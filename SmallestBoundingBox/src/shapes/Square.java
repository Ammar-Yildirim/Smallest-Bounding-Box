/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 * The Square class represents a square shape in a two-dimensional space.
 * It is an implementation of the Shape class with all sides of equal length.
 *
 *
 * @author Ammar
 */
public class Square extends Shape {
    
    public Square(double centerX, double centerY, double length) {
        super(centerX, centerY, length);
    }
    
    /**
     * Gets the lower-left corner point of the bounding box that encloses the square.
     * The bounding box is aligned with the x-axis of the coordinate system.
     *
     * @return a Point representing the lower-left corner of the bounding box
     */
    @Override
    public Point getLowerLeftCorner(){
        double x = center.getX() - length/2;
        double y = center.getY() - length/2;
        
        return new Point(x,y);
    }
    
    /**
     * Gets the upper-right corner point of the bounding box that encloses the square.
     * The bounding box is aligned with the x-axis of the coordinate system.
     *
     * @return a Point representing the upper-right corner of the bounding box
     */
    @Override
    public Point getUpperRightCorner(){
        double x = center.getX() + length/2;
        double y = center.getY() + length/2;
        
        return new Point(x,y);
    }
}
