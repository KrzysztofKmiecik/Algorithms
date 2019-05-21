package com.azdybel.algs.Main;

import com.azdybel.algs.Algs.BinarySearch;
import com.azdybel.algs.Algs.ListBinarySearch;
import com.azdybel.algs.Helpers.TimeMeasurementHelper;

public class Main {
    public static void main(String[] args) {
//        ListInsertionSort myListIn = new ListInsertionSort();
////        myListIn.setup();
//        InsertionSort insertionSort = new InsertionSort();
//        TimeMeasurementHelper.ExecutionTimeMeasure(insertionSort,true);

        BinarySearch binarySearch = new BinarySearch();
        TimeMeasurementHelper.ExecutionTimeMeasure(binarySearch, true);

        ListBinarySearch listBinarySearch = new ListBinarySearch();
        TimeMeasurementHelper.ExecutionTimeMeasure(listBinarySearch, true);
//        ListInsertionSort listInsertionSort = new ListInsertionSort();
//        TimeMeasurementHelper.ExecutionTimeMeasure(listInsertionSort,true);


      /*  insertionSort.setup();
        insertionSort.insertElementAt(2, 1);
        insertionSort.sort();*/

/////////////
       /* BinarySearch ob = new BinarySearch();
        Integer arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 4;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element in arr not present");
        else
            System.out.println("Element found in arr  at "
                    + "index " + result);*/

//        ListBinarySearch listBinarySearch = new ListBinarySearch();
//        ArrayList<Integer> myarray = new ArrayList<Integer>();
//        myarray.add(2);
//        myarray.add(3);
//        myarray.add(4);
//        myarray.add(10);
//        myarray.add(40);
//        result = listBinarySearch.binarySearch(myarray, x);
//        if (result == -1)
//            System.out.println("Element in arr not present");
//        else
//            System.out.println("Element found in arr  at "
//                    + "index " + result);


    }

}
