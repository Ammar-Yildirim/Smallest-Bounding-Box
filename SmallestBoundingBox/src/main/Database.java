/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import shapes.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.NEGATIVE_INFINITY;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Database class represents a collection of geometric shapes and provides 
 * methods for reading shape data from a file and generating a report.
 *
 * @author Ammar 
 */
public class Database {
    private final List<Shape> shapes;

    public Database() {
        shapes = new ArrayList<>();
    }
    
    /**
     * Reads shape data from a file and populates the database with the shapes.
     * 
     * @param fileName
     * @throws FileNotFoundException
     * @throws IOException
     * @throws NumberFormatException 
     */
    public void read(String fileName) throws FileNotFoundException, IOException, NumberFormatException{
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            
            int n = Integer.parseInt(br.readLine());
            if( n <= 0) throw new IllegalArgumentException("Number of shapes should not be 0 or negative");
                    
            
            for(int i=0; i<n;i++){
                Shape shape;
                
                String[] tokens = br.readLine().split(" ");
                double centerX = Double.parseDouble(tokens[1]); //NumberFormatExeption
                double centerY = Double.parseDouble(tokens[2]);
                double length = Double.parseDouble(tokens[3]); 
                switch (tokens[0]) {
                case "C":
                    shape = new Circle(centerX, centerY, length);
                    break;
                case "S":
                    shape = new Square(centerX, centerY, length);
                    break;
                case "H":
                    shape = new Hexagon(centerX, centerY, length);
                    break;
                case "T":
                    shape = new Triangle(centerX, centerY, length);
                    break;
                default:
                    throw new IllegalArgumentException("Type doesn't exist");
                } 
                shapes.add(shape);
            }
        } 
    }
    
    /**
     * Generates and prints the coordinates of the lower-left and upper-right 
     * corners of the bounding box.
     */
    public void report(){
        Point LowerCorner = getLowerLeftCorner();
        Point UpperCorner = getUpperRightCorner();
        
        System.out.println("Lower Corner" + LowerCorner + " Upper Corner " + UpperCorner);
    }
    
    /**
     * Calculates and returns the lower-left corner point of the bounding box 
     * that encloses all shapes in the database.
     * 
     * Accomplishes that by going through all shapes and comparing the x and y
     * coordinate of the lower left corner of each shape.
     * 
     * @return a Point representing the lower-left corner of the bounding box
     */
    private Point getLowerLeftCorner(){
//        double x = shapes.stream()
//                .map(shape -> shape.getLowerLeftCorner())
//                .min(new SortPointsByX()).get().getX();
//        
//        double y = shapes.stream()
//                .map(shape -> shape.getLowerLeftCorner())
//                .min(new SortPointsByY()).get().getY();
//        
        
        double x = Double.POSITIVE_INFINITY;
        for(Shape s: shapes){
            double lowerLeftX = s.getLowerLeftCorner().getX();
            if( lowerLeftX < x){
                x = lowerLeftX;
            }
        }
        
        double y = Double.POSITIVE_INFINITY;
        for(Shape s: shapes){
            double lowerLeftY = s.getLowerLeftCorner().getY();
            if(lowerLeftY < y){
                y = lowerLeftY;
            }
        }
        
        return new Point(x,y);
    }
    
    /**
     * Calculates and returns the upper-right corner point of the bounding box 
     * that encloses all shapes in the database.
     * 
     * Accomplishes that by going through all shapes and comparing the x and y
     * coordinate of the lower left corner of each shape.
     *
     * @return a Point representing the upper-right corner of the bounding box
     */
    
    private Point getUpperRightCorner(){
//        double x = shapes.stream()
//                .map( shape -> shape.getUpperRightCorner())
//                .max(new SortPointsByX()).get().getX();
//        
//        double y = shapes.stream()
//                .map( shape -> shape.getUpperRightCorner())
//                .max(new SortPointsByY()).get().getY();
        double x = Double.NEGATIVE_INFINITY;
        for(Shape s: shapes){
            double upperRightX = s.getUpperRightCorner().getX();
            if( upperRightX > x){
                x = upperRightX;
            }
        }
        
        double y = Double.NEGATIVE_INFINITY;
        for(Shape s: shapes){
            double upperRightY = s.getUpperRightCorner().getY();
            if(upperRightY > y){
                y = upperRightY;
            }
        }
        
        return new Point (x,y);
    }
    
}
