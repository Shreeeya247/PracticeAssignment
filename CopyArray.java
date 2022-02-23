package com.company;

import java.util.Scanner;

public class CopyArray {
    public void IterationMethod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        Integer n = scan.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter the array elements: ");

        for (int i = 0; i < n ; i++){
            arr1[i] = scan.nextInt();
        }

        for(int i = 0; i < n; i++){
            arr2[i] = arr1[i];
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    public void SysArrayCopyMethod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the size of array: ");
        Integer n = scan.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter the array elements: ");

        for (int i = 0; i < n ; i++){
            arr1[i] = scan.nextInt();
        }
        System.arraycopy(arr1, 0, arr2, 0, n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    public static void main(String args[]){
        CopyArray obj = new CopyArray();
        obj.IterationMethod();
        obj.SysArrayCopyMethod();
    }
}
