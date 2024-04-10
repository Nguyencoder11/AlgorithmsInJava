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
public class InsertionSort {

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
            insertionSortAsc(arr, n);
            printArr(arr, n);

            System.out.print("Desc array: ");
            insertionSortDesc(arr, n);
            printArr(arr, n);
        } catch (InputMismatchException e) {
            System.out.println("An error occured: " + e);
        } catch (NegativeArraySizeException e) {
            System.out.println("Error occured: " + e);
        }
    }

    // Sap xep noi bot tang dan
    private static void insertionSortAsc(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int tempElement = a[i];
            int j = i - 1;
            while (j > -1 && tempElement < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = tempElement;
        }
    }

    // Sap xep noi bot giam dan
    private static void insertionSortDesc(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int tempElement = a[i];
            int j = i - 1;
            while (j > -1 && tempElement > a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = tempElement;
        }
    }

    private static void printArr(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
