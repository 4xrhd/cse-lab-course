/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1.javalab4;

/**
 *
 * @author oc
 */
public class Program2 {

    

    public static void main(String[] args) {
        CalculateCircleArea car = new CalculateCircleArea();

        // Example values
        double circleRadius = 5;
        double rectangleLength = 4;
        double rectangleWidth = 6;

        // Calculating areas
        double circleArea = car.calculateCircleArea(circleRadius);
        double rectangleArea = car.calculateRectangleArea(rectangleLength, rectangleWidth);

        // Printing results
        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}

