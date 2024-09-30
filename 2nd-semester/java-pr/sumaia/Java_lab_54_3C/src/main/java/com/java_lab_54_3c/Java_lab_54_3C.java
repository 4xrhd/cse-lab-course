//Sumaia Bintey Ismail
//ID:0432320005101103

//Write a java program to print to sum up an array values

package com.java_lab_54_3c;

public class Java_lab_54_3C {

    public static void main(String[] args) {
        int[] ar = {1,3,5,7,11,13,15,17};
        int sum = 0;
        for(int i=0;i<8;i++)
        {
            sum = sum + ar[i];
        }
        System.out.print("Sum is: "+sum);
    }
}
