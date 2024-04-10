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
public class SelectionSort {

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
            selectionSortAsc(arr, n);
            printArr(arr, n);
            
            System.out.print("Desc array: ");
            selectionSortDesc(arr, n);
            printArr(arr, n);
        } catch (InputMismatchException e) {
            System.out.println("An error occured: " + e);
        } catch (NegativeArraySizeException e) {
            System.out.println("Error occured: " + e);
        }
    }

    // Sap xep noi bot tang dan
    private static void selectionSortAsc(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }

            if (min_index != i) {
                int tmp = a[min_index];
                a[min_index] = a[i];
                a[i] = tmp;
            }
        }
    }

    // Sap xep noi bot giam dan
    private static void selectionSortDesc(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int max_index = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[max_index]) {
                    max_index = j;
                }
            }

            if (max_index != i) {
                int tmp = a[max_index];
                a[max_index] = a[i];
                a[i] = tmp;
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
