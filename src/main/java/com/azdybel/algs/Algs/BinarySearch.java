package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IBinarySearch;

public class BinarySearch implements IBinarySearch<Integer[]>, IAlgorithmRunner {

    private Integer[] arr;
    private Integer valueToSearch;

    @Override
    public int binarySearch(Integer[] arr, int x) {

        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;
            // If x greater, ignore left half
            if (arr[mid] < x)
                left = mid + 1;
                // If x is smaller, ignore right half
            else
                right = mid - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    @Override
    public void setup() {
        this.arr = new Integer[]{4, 3, 2, 5, 7};
        this.valueToSearch = 2;
        System.out.print("ArrayBinarySearch :");
    }

    @Override
    public void run() {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(this.arr);
        this.arr = insertionSort.getSortedArray();
        int result = this.binarySearch(this.arr, this.valueToSearch);
//        if (result == -1)
//            System.out.println("Element in arr not present");
//        else
//            System.out.println("Element found in arr  at "
//                    + "index " + result);
    }
}
