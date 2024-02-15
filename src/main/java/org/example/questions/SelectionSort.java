package org.example.questions;

public class SelectionSort {

    public static void selection(int[] arr, int n){

        for(int i = 0; i<n; i++){
            int min = i;
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[i]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
