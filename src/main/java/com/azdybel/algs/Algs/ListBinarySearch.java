package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IBinarySearch;

import java.util.ArrayList;

public class ListBinarySearch implements IBinarySearch<ArrayList<Integer>> {



    @Override
    public int binarySearch(ArrayList list, int x) {

        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid

            if (((int)list.get(mid)) == x)
                return mid;

            // If x greater, ignore left half
            if (((int)list.get(mid)) < x)
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
