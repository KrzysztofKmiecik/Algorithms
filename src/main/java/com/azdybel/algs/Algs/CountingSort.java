package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IcountingSort;

public class CountingSort implements IcountingSort, IAlgorithmRunner {

    private int[] arr;

    @Override
    public void setup() {
        this.arr = new int[5];
        this.arr[0] = 4;
        this.arr[1] = 3;
        this.arr[2] = 2;
        this.arr[3] = 5;
        this.arr[4] = 7;
        System.out.print("CountingSort :");
    }

    @Override
    public void run() {
        this.sort(arr, 7);
//        for(int i=0; i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
    }

    @Override
    public int[] sort(int[] input, int k) {
            int counter[] = new int[k + 1];
            for (int i : input) {
                counter[i]++;
            }
            int ndx = 0;
            for (int i = 0; i < counter.length; i++) {
                while (0 < counter[i]) {
                    input[ndx++] = i;
                    counter[i]--;
                }
            }
            return input;
    }
}
