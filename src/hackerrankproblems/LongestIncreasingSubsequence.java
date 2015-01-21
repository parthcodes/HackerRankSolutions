/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrankproblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Parth
 */
public class LongestIncreasingSubsequence {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        int[] data = new int[count];
        
        for(int i=0;i<count;i++){
            data[i] = sc.nextInt();
        }
        
        System.out.println(longestIncreasingSubsequence(data));
        
    }
    
     static int longestIncreasingSubsequence(int[] data){
        int LIC = 0;
        ArrayList<ArrayList<Integer>> l = new  ArrayList<ArrayList<Integer>>(); 
        
        for(int i=0;i<data.length;i++)
        l.add(new ArrayList<Integer>());
        
        l.get(0).add(data[0]);
        
        for(int i=1;i<data.length;i++){
            for(int j=0;j<i;j++){
                if(data[j]<data[i] && l.get(i).size()<l.get(j).size()+1){
                    
                    l.get(i).clear();
                    for(Integer t:l.get(j)){
                        l.get(i).add(t);
                    }
                }
            }
            
            l.get(i).add(data[i]);
            LIC = Math.max(LIC,l.get(i).size());
            
        }
        return LIC;
   
}
}
