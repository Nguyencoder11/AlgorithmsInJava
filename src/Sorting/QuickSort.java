/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class QuickSort {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{12, 13, 24, 10, 3, 6, 90, 70};

        // goi ham quicksort
        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(Integer[] array, int l, int r) {
        if (array == null || array.length == 0) {
            return;
        }

        if (l > r) {
            return;
        }

        // Chon phan tu o giua lam pivot
        int pivot = array[l + (r - l) / 2];

        // Tien hanh phan chia mang
        int i = l, j = r;

        while (i < j) {
            // Kiem tra cho den khi tat ca gia tri mang ben trai nho hon pivot
            while (array[i] < pivot) {
                i++;
            }

            // Kiem tra cho den khi tat ca gia tri mang ben phai lon hon pivot
            while (array[j] > pivot) {
                j--;
            }

            // tien hanh so sanh gia tri tu ca 2 phia xem co can doi cho hay khong
            if (i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }

            // De quy sap xep cac mang con
            if (l < j) {
                quickSort(array, l, j);
            }

            if (r > i) {
                quickSort(array, i, r);
            }
        }
    }
}
