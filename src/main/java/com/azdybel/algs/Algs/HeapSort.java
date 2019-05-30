package com.azdybel.algs.Algs;

import com.azdybel.algs.Helpers.SortUtils;
import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IHeapSort;

public class HeapSort implements IHeapSort, IAlgorithmRunner {


    int[] arr;
    @Override
    public void setup() {
        this.arr = new int[5];
        this.arr[0] = 4;
        this.arr[1] = 3;
        this.arr[2] = 2;
        this.arr[3] = 5;
        this.arr[4] = 7;
        System.out.print("HeapSort :");
        }

        @Override
        public void run () {
            this.sort(arr);
        }

        @Override
        public void sort ( int[] arrayToSort){
            int n = arrayToSort.length;
            HeapSort heapSort = new HeapSort();
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapSort.validateMaxHeap(arrayToSort, n, i);
            }

            for (int i = n - 1; i > 0; i--) {
                SortUtils.swap(arrayToSort, 0, i);
                heapSort.validateMaxHeap(arrayToSort, --n, 0);
            }
        }

        private void validateMaxHeap(int[] array, int heapSize, int parrentIndex){
            int maxIndex = parrentIndex;
            int leftChild = parrentIndex * 2 + 1;
            int rightChild = parrentIndex * 2 + 2;

            if (leftChild < heapSize && array[leftChild] > array[maxIndex]) {
                maxIndex = leftChild;
            }
            if (rightChild < heapSize && array[rightChild] > array[maxIndex]) {
                maxIndex = rightChild;
            }
            if (maxIndex != parrentIndex) {
                SortUtils.swap(array, maxIndex, parrentIndex);
                validateMaxHeap(array, heapSize, maxIndex);
            }

        }

    }
