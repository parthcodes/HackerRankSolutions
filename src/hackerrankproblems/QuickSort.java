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
public class QuickSort {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        
        quickSort(a, 0, a.length-1);
    }
    
    public static void quickSort(int []ar, int first, int last){
        
       
        if(ar.length<=1)return;
        int left = first;
        int right = last-1;
        int pivot = ar[last];
        int swapTemp;
        
        while(left<=right){
            while(ar[left]<pivot){
                left++;
            }
             while(ar[right]>pivot){
                right--;
            }
            
            if(left<=right){
           //swap(ar[left], ar[right]);
                swapTemp = ar[left];
                ar[left] = ar[right];
                ar[right] = swapTemp;
            }
             else{
                break;
            }
        }
        swapTemp = ar[left];
        ar[left] = pivot;
        ar[last] = swapTemp;
        printElements(ar);
    }
    
    public static void printElements(int []ar){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
            
        }
         System.out.println();
    }
    
}
