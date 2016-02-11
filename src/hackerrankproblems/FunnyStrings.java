/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrankproblems;

import java.util.Scanner;

/**
 *
 * @author Parth
 */
public class FunnyStrings {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int loop = sc.nextInt();
        String[] str = new String[loop];
        for(int i=0;i<loop;i++){
            str[i] = sc.nextLine();
        }
        
        for(int i=0;i<loop;i++){
            String stReverse = new StringBuilder(str[i]).reverse().toString();
            
            char[] strC = str[i].toCharArray();
            char[] stReverseC = stReverse.toCharArray();
            
            //Boolean checkFlag=false;
            
            for(int j=1;j<strC.length;j++){
            if((Math.abs((int)strC[j]-(int)strC[j-1]))==Math.abs(((int)stReverseC[j]-(int)stReverseC[j-1]))){
                if(j==strC.length-1)System.out.println("Funny");
              continue;  
            }
                
            else
            {
                System.out.println("Not Funny");
                break;
            }
                
        }
        
           

        }
        
        
    }
    
}
