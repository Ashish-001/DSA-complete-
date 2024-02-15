package org.example;


import org.example.questions.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {5,6,1,10,7,8};
        SelectionSort.selection(arr,n);
    }
}