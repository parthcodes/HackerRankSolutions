/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrankproblems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author Parth
 */
public class InsertionSort1 {
    
    

    public static void insertIntoSorted(int[] ar) {
        //This is the sorting function
        int checkNumber = ar[ar.length-1];
        int n= ar.length-2;
        for(int i=n;i>=0;i--){
            if(ar[i]>checkNumber){
                ar[i+1] = ar[i];
                    if(i==0){
                        ar[i]=checkNumber;
                    }
            }
            else if (ar[i]<=checkNumber){
                ar[i+1]=checkNumber;
            }
                    InsertionSort1.printArray(ar);

        }

    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
