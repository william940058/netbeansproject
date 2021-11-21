/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catsort;


/**
 *
 * @author macbookpro
 */
public class CatSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String line = reverseAndCap("abcdefg3!");
        System.out.println(line.toUpperCase());
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Oscar", 8.0, 3);
        cat[1] = new Cat("Max", 9.2, 2);
        cat[2] = new Cat("Molly", 7.9, 5);
        cat[3] = new Cat("Coco", 8.9, 1);
        cat[4] = new Cat("Tiger", 9.1, 4);
        quickSort(cat, 0, cat.length-1);
        for(Cat ca: cat){
            System.out.println(ca);
        }
        LinkedCatList lists = new LinkedCatList();
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Min", 8.0, 3);
        cats[1] = new Cat("Max", 9.2, 2);
        cats[2] = new Cat("Molly", 7.9, 5);
        cats[3] = new Cat("Coco", 8.9, 1);
        cats[4] = new Cat("Tiger", 9.1, 4);
        lists.addFirst(cats[0]);
        lists.add(cats[1]);
        lists.add(cats[2]);
        lists.add(cats[3]);
        lists.add(cats[4]);
        lists.quickSort(lists.getFirst(),lists.getLast());
        lists.displayList();
            
    }
    public static String reverseAndCap(String text){
        if (text.length() <= 1) {
            return text;
        }
        return reverseAndCap(text.substring(1)) + text.charAt(0);
    }

    public static void swap(Cat [] arr, int a, int b){
        Cat temp = arr[b];
        arr[b]= arr[a];
        arr[a] = temp;
        
    }
    public static int partition(Cat[]arr, int low, int high){
        double pivot = arr[high].getWeight();
        int i = low -1;
        for(int j = low; j < high; j++){
            if(arr[j].getWeight()<= pivot){
                i++;
                swap(arr, i , j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    public static void quickSort(Cat[] arr, int low, int high){
        if(low < high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
            
        }
    }

}
