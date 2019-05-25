package com.azdybel.algs.Algs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {
    int[] arr;
    int[] arrOK;

    @Before
    public void setUp() throws Exception {
        this.arr = new int[5];
        this.arr[0] = 4;
        this.arr[1] = 3;
        this.arr[2] = 2;
        this.arr[3] = 5;
        this.arr[4] = 7;
        System.out.println("CountingSort :"); //2,3,4,5,7

        arrOK = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrOK[i] = arr[i];
        }
        Arrays.sort(arrOK);
    }

    @Test
    public void quickSort() {
        QuickSort myquickSort = new QuickSort();
        int pp = myquickSort.partition(arr, 0, 4);
        System.out.println("PP=" + pp);
        int[] arrSorted= myquickSort.quickSort(arr,0,4);
        for (int p : arrSorted) {
            System.out.println(p);
        }
        Assert.assertArrayEquals(arrOK,arrSorted);
    }
}