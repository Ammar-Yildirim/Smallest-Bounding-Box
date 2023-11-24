/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 * The Triangle class represents an equilateral triangle shape in a two-dimensional space.
 * It is a specific implementation of the Shape class with all sides of equal length.
 *
 * 
 * @author Ammar
 */
public class Triangle extends Shape {

    public Triangle(double centerX, double centerY, double length) {
        super(centerX, centerY, length);
    }
     
    /**
     * Gets the lower-left corner point of the bounding box that encloses the equilateral triangle.
     * The bounding box is aligned with the axes of the coordinate system.
     * 
     * @return a Point representing the lower-left corner of the bounding box
     */
    @Override
    public Point getLowerLeftCorner(){
        double x = center.getX() - length/2;
        double y = (center.getY() - (Math.sqrt(3) * length/6));
        
        return new Point(x,y);
    }
    
    /**
    * Gets the upper-right corner point of the bounding box that encloses the equilateral triangle.
    * The bounding box is aligned with the axes of the coordinate system.
    *
    * @return a Point representing the upper-right corner of the bounding box
    */
    @Override
    public Point getUpperRightCorner(){
        double x = center.getX() + length/2;
        double y = (center.getY() + (Math.sqrt(3) * length/3));
        
        return new Point(x,y);
    }
}
