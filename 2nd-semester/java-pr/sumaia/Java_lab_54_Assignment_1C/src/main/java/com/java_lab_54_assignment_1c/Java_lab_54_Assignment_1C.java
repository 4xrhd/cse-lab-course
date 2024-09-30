//Sumaia Bintey Ismail
//ID:0432320005101103

/*Write a java program to find and count an 'a'
character in a string named Bangladesh*/

package com.java_lab_54_assignment_1c;

public class Java_lab_54_Assignment_1C {

    public static void main(String[] args) {
        String country = "Bangladesh";
        char findChar = 'a' ;
        int count = 0 ;
        for(int i=0;i<country.length();i++){
        if(country.charAt(i)==findChar){
            count++ ;}
        }
        System.out.println(count + " ");
    }
}
