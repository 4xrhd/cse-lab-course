//Sumaia Bintey Ismail
//ID:0432320005101103

//Write a java program to replace a number in an array

package com.java_lab_54_3f;

public class Java_lab_54_3F {

    public static void main(String[] args) {
        int[] ar = {1,3,5,7,11,13,15,17};
        int replace = 10;
        for(int i=0;i<8;i++){
            if(ar[i]%5==0){
                ar[i] = replace;
            } 
            System.out.print(ar[i] +" ");
        }         
    }
}
