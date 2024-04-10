/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BubbleSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int[] arr;

        try {
            System.out.print("n = ");
            n = scan.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("a[%d] = ", i);
                arr[i] = scan.nextInt();
            }

            System.out.print("Asc array: ");
            bubbleSortAsc(arr, n);
            printArr(arr, n);
            
            System.out.print("Desc array: ");
            bubbleSortDesc(arr, n);
            printArr(arr, n);
        } catch (InputMismatchException e) {
            System.out.println("An error occured: " + e);
        } catch (NegativeArraySizeException e) {
            System.out.println("Error occured: " + e);
        }
    }

    // Sap xep noi bot tang dan
    private static void bubbleSortAsc(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }
    }

    // Sap xep noi bot giam dan
    private static void bubbleSortDesc(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] < a[j]) {
                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }
    }

    private static void printArr(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
