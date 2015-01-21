/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrankproblems;

/**
 *
 * @author Parth
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockPairs {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        
        
        
        for(int t=0;t<testCases;t++){
            
            int numberOfElements = sc.nextInt();
            int current;
            ArrayList<Integer> elements= new ArrayList<Integer>();
            Set<Integer> uElements = new HashSet<Integer>();
            ArrayList<Integer> fList= new ArrayList<Integer>();
            for(int i=0;i<numberOfElements;i++){
                current = sc.nextInt();
                elements.add(current);
               // uElements.add(current);
                
            }
            //now get occurances of each value 
            //store it in another arraylist, store frequency in another arraylist (or we can use HashMap)
            
            long counter=0;
        
            for(Integer i :uElements){
                
                //check if the element is in checkList?
                
                
               
                //get the frequency of an element
                int frequency = Collections.frequency(elements, i);
                
                //store the frequency and element in an ArrayList.
                fList.add(frequency);
                
                
            }
            
            //go through all the frequency in the list and apply the function.
             for(Integer values:fList){
                    if(values.equals(1)) counter+=0;
                    if(values.equals(2))counter+=2;
                    else
                        counter+=(values * (values-1));
                }
            fList.clear();
                
            
            System.out.println(counter);
        }
    }
}
