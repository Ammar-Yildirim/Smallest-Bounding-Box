/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 * The abstract Shape class represents a geometric shape with a center point and a length.
 * It serves as a base class for various shapes in a two-dimensional space..
 * 
 * @author Ammar
 */
public abstract class Shape {
    protected Point center;
    protected double length;
    
    public Shape(double centerX, double centerY, double length) {
        if(length <= 0) throw new IllegalArgumentException("Length cant be <=0");
        center = new Point(centerX, centerY);
        this.length = length;
    }
    
    public abstract Point getLowerLeftCorner(); 
    public abstract Point getUpperRightCorner();
}
