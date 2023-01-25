/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.assignment1;
/**
 *
 * @author Jvoll
 */
import java.util.*;

public class App {

    public static void main(String[] args) {
        long start, end, time;
        int cnt = 50; // #iterations
        try (Formatter fmt = new Formatter()) {
            start = System.nanoTime(); // starts timer
            f(cnt); // synthetic bit of "work"
            end = System.nanoTime(); // stops timer
            time = end - start; // duration(ns)
            
            fmt.format("\n%,d steps tooks ~%,d ns\n(~%.2g ns/step\nm", 
                    cnt, time, (double) time/cnt);
        }
        
        // define random number to fill lists
        Random randNum = new Random();
        
        // define list1 as array and fill with 100 random numbers
        int[] list1 = new int[100];
        for (int i = 0; i < 100; i++) {
            list1[i] = randNum.nextInt();
        }
        
        // define list2 as ArrayList and fill with 1000 random numbers
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            list2.add(randNum.nextInt());
        }
        
        // Selection and Insertion sort method callings for both lists
        //sortArray(list1); 
        //sortList(list2);
        //insSortArray(list1);
        //insSortList(list2);
    }
    // selection sort method for arrays
    private static void sortArray(int[] data) {
        for (int i=0; i<data.length-1; i++){
            for (int j=i+1; j<data.length; j++) {
                if (data[i] < data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        System.out.println("PASS " + i + ":  ");
        printArray(data);
        }
    }
    // insertion sort method for arrays
    static void insSortArray(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println("PASS " + i + ":  ");
            printArray(arr);
        }
    }
    // selection sort method for array lists
    public static void sortList(ArrayList<Integer> data) {
        for (int i=0; i<data.size()-1; i++){
            int pos = i;
            for (int j=i+1; j<data.size(); j++) {
                if (data.get(j) < data.get(pos)) { pos = j; }
            }
        int min = data.get(pos);
        data.set(pos,data.get(i));
        data.set(i, min);
        printList(i+1, data);
        }
    }
    // insertion sort method for array lists
    public static void insSortList(ArrayList<Integer> data) {
        int n = data.size();
        for (int i = 1; i < n; ++i) {
            int key = data.get(i);
            int j = i - 1;
            
            while (j >= 0 && data.get(j) > key) {
                data.set(j+1, data.get(j));
                j = j-1;
            }
            data.set(j+1, key);
            printList(i, data);
        }
    }
    // print method for arrays
    private static void printArray(int[] data) {
      for (int i=0; i<data.length; i++) {
         System.out.print(data[i]);
         System.out.print(", ");
      }
      System.out.println();
    }
    // print method for array lists
    private static void printList(int pass, ArrayList<Integer> array) {
        System.out.println("PASS " + pass + ":  ");
        for (int i = 0; i < array.size()-1; i++) {
            System.out.print(array.get(i) + ", ");
        }
        System.out.print(array.get(array.size()-1) + ".");
        System.out.println();
    }
    // "work" method
    static long f(long n) {
        if (n <= 1) return n;
        return f(n-1) + f(n-2);
    }   
}
    
   
