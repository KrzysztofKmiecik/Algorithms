package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IBinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class ListBinarySearch implements IBinarySearch<ArrayList<Integer>>, IAlgorithmRunner {

    private ArrayList<Integer> list;
    private Integer valueToSearch;

    @Override
    public int binarySearch(ArrayList<Integer> list, int x) {

        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid

            if (((int) list.get(mid)) == x)
                return mid;

            // If x greater, ignore left half
            if (((int) list.get(mid)) < x)
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

        ArrayList<Integer> myarray = new ArrayList<Integer>();
        myarray.add(4);
        myarray.add(3);
        myarray.add(2);
        myarray.add(5);
        myarray.add(7);
        this.list = myarray;
        this.valueToSearch = 2;
        System.out.print("ListBinarySearch :");

    }

    @Override
    public void run() {
        // ListInsertionSort listInsertionSort = new ListInsertionSort();
        Collections.sort(this.list);
        int result = this.binarySearch(this.list, this.valueToSearch);
//        if (result == -1)
//            System.out.println("Element in arr not present");
//        else
//            System.out.println("Element found in arr  at "
//                    + "index " + result);
    }
}
