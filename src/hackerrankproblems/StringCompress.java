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
public class StringCompress {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output="";
        int j=0;
        int counter=0;
       char temp = '\0';
        
        for(int i=0;i<input.length();i++){
            temp=input.charAt(j);
            
             if(input.charAt(i)==temp){
                 counter++;
             }
             
            else{
                output+=String.valueOf(temp)+counter;
                counter=1;
                j=i;
            }  
            
        }
        output+=String.valueOf(temp)+counter;
        
        if(output.length()>input.length()){
            output=input;
        }
        System.out.print(output);
        
    }
}
