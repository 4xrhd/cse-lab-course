/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1.javalab4;

/**
 *
 * @author oc
 */
public class Program3 {
    

    public static void main(String[] args) {
        Box box = new Box(5.0, 3.0, 2.0);
        
        double volume = box.calculateVolume();
        
        System.out.println("Volume of the box: " + volume);
    }
}


