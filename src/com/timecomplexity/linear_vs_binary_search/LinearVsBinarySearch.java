package com.timecomplexity.linear_vs_binary_search;
import java.util.*;
import java.lang.*;
public class LinearVsBinarySearch {
    // Define the binarySearch method for binary search
    public static long binarySearch(int arr[]){

        // taking variable n is length of array
        int n = arr.length;

        // start time of code
        long startTime = System.nanoTime();

        // Taking Start and End variable of array
        int start = 0;
        int end = n-1;

        // iterate the loop until Start is greater than End
         while(start<=end){
             // divide the array into two part
             int mid = (end+start)/2;
             // if array mid equal to target return mid
             if(end==arr[mid]){
                 return mid;
             }
            // if target is less than to mid
             if(end<arr[mid]){
                 end = mid-1;
             }
             // if target is greater than to mid
             else {
                 start = mid+1;
             }
         }

        // End time of code
        long endTime = System.nanoTime();

        // Return the total time of code
        return endTime-startTime;
    }

    public static long linearSearch(int arr[]){
        // taking variable n is length of array
        int n = arr.length;

        // Start time of code is here
        long startTime = System.nanoTime();

        // iterate the array in end for linear search
        for(int i = 0 ; i<n ; i++){
             arr[i] = (int)Math.random()*10;
        }
        // End time of code in here
        long endTime = System.nanoTime();

        // Return the total time of code
        return endTime-startTime;
    }
    public static void main(String[] args){

        // intilaizing array
        int thousands[] = new int[1000];
        int tenthousands[] = new int[10000];
        int tenlakhs[] = new int[1000000];
        long linearTime[] = new long [3];
        long binaryTime[] = new long [3];

        // calling the linearSearch store lineartime[] array
        linearTime[0] = linearSearch(thousands);
        linearTime[1] = linearSearch(tenthousands);
        linearTime[2] = linearSearch(tenlakhs);

        // calling the binarySearch store binarttime[] array
        binaryTime[0] = binarySearch(thousands);
        binaryTime[1] = binarySearch(tenthousands);
        binaryTime[2] = binarySearch(tenlakhs);

        // Display the result
        System.out.printf("-------------------------------------------------------%n");
        System.out.printf("| %15s | %15s | %15s | %n","Data Set(N)" ,"Linear Search" ,"Binary Search");
        System.out.printf("-------------------------------------------------------%n");
        System.out.printf("| %15s | %15s | %15s | %n","1,000",linearTime[0]+" ns",binaryTime[0]+" ns");
        System.out.printf("-------------------------------------------------------%n");
        System.out.printf("| %15s | %15s | %15s | %n","10,000",linearTime[1]+" ns",binaryTime[1]+" ns");
        System.out.printf("-------------------------------------------------------%n");
        System.out.printf("| %15s | %15s | %15s | %n","10,00,000",linearTime[2]+" ns",binaryTime[2]+" ns");
        System.out.printf("-------------------------------------------------------%n");
    }
}
