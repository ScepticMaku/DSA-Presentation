package com.insertion_sort;

public class main {
    public static void main(String[] args) {
        
        int arr[] = { 12, 11, 13, 5, 6 };
        
        System.out.println("Before: ");
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("\nAfter: ");
        sort(arr);
        printArray(arr);
        
        // First i loop 12, 11, 13, 5, 6: Selects 11 as a starting point for target and 12 is assumed to be sorted
        // initializes key as 11 which makes arr[i](arr[1]) empty and intializes search variable j as i but 0
        // while j(0) >= 0 and arr[j](12) > key(11), true: then, arr[j+1]{arr[1](empty) = arr[j](12)}, initializes j to -1
        // while j(-1) >= 0 and arr[j](empty) > key(11), false: then, the while breaks.
        // lastly, arr[j + 1](0) = key(11)
        
        // Thus, the array after the first loop should be: 11, 12, 13, 5, 6 
    }
    
    public static void sort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            
            arr[j + 1] = key;
            
            // breaks after the first loop, convert to comment to disable
           // break;  
        }
    }
    
    public static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
