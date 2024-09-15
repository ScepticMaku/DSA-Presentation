package com.selection_sort;

public class main {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        System.out.println("Before: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("\nAfter: ");
        sort(arr);
        printArray(arr);
        
        // first i loop 64, 25, 12, 22, 11: selects 64 as starting point for target element
        // j loop 1 if arr[j](25) < arr[min_idx](64) then min_idx = j which selects 25 as target
        // j loop 2 if arr[j](12) < arr[min_idx](25) then min_idx = j which selects 12 as target
        // j loop 3 if arr[j](22) < arr[min_idx](12) then skips
        // j loop 4 if arr[j](11) < arr[min_idx](12) then min_idx = j which selects 11 as target
        // j loop 5 if(arr[j](11) < arr[min_idx](11) then skips
        
        //temp(empty) = arr[min_idx](11)
        //arr[min_idx](empty) = arr[i](64)
        //arr[i](empty) = temp(11)
        
        //thus, 11, 25, 12, 22, 64 is the updated array after the first loop
    }
    
    public static void sort(int arr[]){
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            int min_idx = i;
            
            for(int j = i + 1; j < n; j++)
                if(arr[j] < arr[min_idx])
                    min_idx = j;
            
            int temp = arr[min_idx];  
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
            // breaks after the first loop, convert to comment to disable
           // break;
        }
    }
    
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
