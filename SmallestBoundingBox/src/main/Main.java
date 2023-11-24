/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Ammar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Database d = new Database();
        
        try{
            d.read("testcase2.txt");
            d.report();
        }catch(FileNotFoundException e){
            System.out.println("File doesn't exist");
        }catch(IOException e){
            System.out.println("I/O error");
        }catch(NumberFormatException e){
            System.out.println("Input can't be parsed");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Missing data");
        }catch(NullPointerException e){
            System.out.println("Please provide data properly");
        }
    }
    
}
