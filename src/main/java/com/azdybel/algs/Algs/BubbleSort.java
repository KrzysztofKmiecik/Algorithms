package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IBubbleSort;

public class BubbleSort implements IBubbleSort, IAlgorithmRunner {

    private Integer[] table;
    private int[] arr;

    @Override
    public int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                swap(j, j + 1, numbers);
//                if(numbers[j]>numbers[j+1]){
//                    int temp=numbers[j+1];
//                    numbers[j+1]=numbers[j];
//                    numbers[j]=temp;
//                }
            }
        }
        return numbers;
    }

    @Override
    public void swap(int a, int b, int[] tab) {
        if (tab[a] > tab[b]) {
            int temp = tab[b];
            tab[b] = tab[a];
            tab[a] = temp;
        }
    }

    @Override
    public void setup() {
        this.arr = new int[5];
        this.arr[0] = 4;
        this.arr[1] = 3;
        this.arr[2] = 2;
        this.arr[3] = 5;
        this.arr[4] = 7;
        System.out.print("BubbleSort :");
    }

    @Override
    public void run() {
        this.sort(arr);
    }
}
