/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2019.pkg2.pkg19;

import java.util.Arrays;

/**
 *
 * @author macbookpro
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vals = {54, 34, 12, 4, 23, 54, 23, 43, 54}; 
        quickSort(vals, 0, vals.length-1);
        System.out.println(Arrays.toString(vals));
    }
    public static void swap(int [] arr, int a, int b){
        int temp = arr[b];
        arr[b]= arr[a];
        arr[a] = temp;
        
    }
    public static int partition(int[]arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;
        for(int j = low; j < high; j++){
            if(arr[j]<= pivot){
                i++;
                swap(arr, i , j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
            
        }
    }
}
