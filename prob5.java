/*
Name: Mariah Schon
Class : 3320-002
Program # : 6 prob5
Due Date : November 17
Honor Pledge: On my honor as a student of the University
of Nebraska at Omaha, I have neither given nor received
unauthorized help on this homework assignment.
NAME: Mariah Schon
NUID: 581
EMAIL: mschon@unomaha.edu
Partners: CSLC
This program implements quick sort with a 3-way partition
*/

import java.util.Scanner;
import java.lang.Math;

public class prob5{

    public static void main (String[] args){

        //        int left[] = new int [];

        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers separated by spaces: ");
        String elements = input.nextLine();

        //break up numbers and put into array
        String arr[]= elements.split(" ");
        int intArr[] = new int[arr.length];
        for (int i = 0; i < intArr.length; ++i) {
            intArr[i] = Integer.parseInt(arr[i]);
            //            System.out.printf("%d\n", intArr[i]);
        }
        
        int size = intArr.length;
             
        //3-way partition
        int pivot = intArr[0];
        int i = 0;
        int j = 0; 
        int n = size - 1;
        int temp;
        System.out.print("Original Array: ");
        for ( int k = 0; k < size; k++) 
            System.out.printf("%d ", intArr[k]);
        System.out.printf("\nThe pivot is: %d\n", pivot);


        while(j <= n){
            if (intArr[j] < pivot){
                temp = intArr[i];
                intArr[i] = intArr[j];
                intArr[j] = temp;
                i+=1;
                j+=1;
            }
            else if (intArr[j] > pivot){
                temp = intArr[j];
                intArr[j] = intArr[n];
                intArr[n] = temp;
                n-=1;
            }
            else
                j+=1;

        }

        System.out.print("Sorted Array: ");
        for ( int k = 0; k < size; k++)
            System.out.printf("%d ", intArr[k]);
        System.out.printf("\n");
    }
}
