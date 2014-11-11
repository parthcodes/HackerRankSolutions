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

public class MakeItAnagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2 = sc.nextLine();
        int counter=0;
                int counter1=0;

        boolean flag=true;
        
        
        char[] a1 = s1.toCharArray();
        
        char[] a2 = s2.toCharArray();
        
        
        for(int i=0;i<a1.length;i++){
            
            for (int j = 0; j < a2.length; j++) {
                if ( a2[j]== a1[i]) {
                     counter++;
                     a2[j]='\0';
                     break;
                    }
            }
        }
        
        for(char c:a2){
            if(c=='\0'){
                counter1++;
            }
        }
        
        
        System.out.println((a1.length-counter)+(a2.length-counter1));
        
        //for(char t:a1)System.out.println(t);
    }
}
