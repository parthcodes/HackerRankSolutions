/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import hackerrankproblems.Pair;

/**
 *
 * @author Parth
 */
public class JimAndBurgers{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int orders = sc.nextInt();
        int[] timeAt = new int[orders];
        int[] timeReq = new int[orders];
        //int[] cost = new int[orders];
        //int[] cost_copy = new int[orders]; 
        Pair[] cost = new Pair[orders];
        for(int i=0;i<orders;i++){
            timeAt[i]= sc.nextInt();
            timeReq[i]= sc.nextInt();
            
            cost[i] = new Pair(i,(timeAt[i] + timeReq[i]));
        }
        
        //copy cost to cost_copy
        //cost_copy=cost;
        Arrays.sort(cost);
        System.out.println(Arrays.toString(cost));
        
    }
     
}
