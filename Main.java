package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void insertIntoSorted(int[] ar) {
        // Walk through the elements from first to last
        int element;
        for (int i = 1; i < ar.length; i++) {
            int countLoop = 1;
            element = ar[i];
            // Case element is less than previous element
            while (element < ar[i -countLoop]) {
                ar[i -countLoop +1] = ar[i -countLoop];
                if (countLoop < i) {
                    countLoop++;
                }
                else if (countLoop == i) {
                    ar[1] = ar[0];
                    ar[0] = element;
                    // Just a high value to don't pass through next IF...
                    element = 45000;
                    break;
                }
                else break;
            }
            // Case element is less then previous element, they swap positions
            if (element < ar[i - countLoop +1]) {
                ar[i - countLoop +1] = element;
            }
            printArray(ar);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
