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

public class ClosestNumbers {

   public static void main(String[] args) {
       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
       Scanner sc = new Scanner(System.in);
       
       int N = sc. nextInt();
       Set<Integer> valuesSet = new HashSet<Integer>();
       List<Integer> answer = new ArrayList<Integer>();
       
       //take two variables for holding difference and min diff. respectively.
       int min = Integer.MAX_VALUE;
       int diff = 0;
       
       for(int i=0;i<N;i++){
           valuesSet.add(sc.nextInt());
       }
       //we have Hashset which is sorted values, removing duplicates
       //go through the Hashset
       
       List<Integer> values = new ArrayList<Integer>(valuesSet);
       
       for(int i=0;i<values.size();i++){
           
           for(int j=i+1;j<values.size();j++){
               
               diff = Math.abs(values.get(i)-values.get(j));
               if(diff<min){
                   min=diff;
                   answer.clear();
                   answer.add(values.get(i));
                   answer.add(values.get(j));
               }
               else if(diff==min){
                       answer.add(values.get(i));
                   answer.add(values.get(j));
                   }
           }
       }
       
       Collections.sort(answer);
       
       for(Integer i:answer)System.out.print(i+" ");
       
   }
}
