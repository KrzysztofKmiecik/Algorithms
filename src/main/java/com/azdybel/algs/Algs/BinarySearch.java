package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IBinarySearch;

public class BinarySearch implements IBinarySearch<Integer[]> {



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


}
