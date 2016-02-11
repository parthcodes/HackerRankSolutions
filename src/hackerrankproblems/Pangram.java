/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrankproblems;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Parth
 */
public class Pangram {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        
        //convert the string into char array
        s= s.toLowerCase();
        char[] c = s.toCharArray();
        
        // loop through the array and put each element in the set. To get unique
        //Create a new hash set
        Set<Character> result = new TreeSet<Character>();
        
        for (char a:c)
            {
            result.add(a);
        }
        
        if(result.size()==26){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
    
}
