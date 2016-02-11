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
public class GridChallenge {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        
        //run the loop for #of test cases
        for(int i = 0;i<testCases;i++){
            int N = sc.nextInt();
            String [] rows = new String[N];
            char[][] input = new char[N][N];
            
           
            //put dummy next line to skip null line
            String dummy = sc.nextLine();
            //run the loop for each input row
            for(int j=0;j<N;j++){
                
               rows[j] = sc.nextLine();
               
               //convert each string to character array and sort the array
               input[j] = rows[j].toCharArray();
               //sort the arrays
               Arrays.sort(input[j]);
            }
            
            //check if everything is lexically sorted
            //m = row 
            //n = column
            outerloop:
            for(int m=0;m<N-1;m++){// traverse on rows
                for(int n=0;n<N;n++){//traverse on column
                    if(input[m][n]<=input[m+1][n]){
                        if(m==N-2 && n==N-1){
                            System.out.println("YES");
                        }
                    }
                    else{
                        System.out.println("NO");
                        break outerloop;
                    }
                }
            }
            
            if(N==1){
                 System.out.println("YES");
            }
            
        }
    }
    
}
