package com.azdybel.algs.Main;

import com.azdybel.algs.Algs.Stack;
import com.azdybel.algs.Algs.StackItem;

import java.util.PriorityQueue;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Queue<Integer> myQue=new PriorityQueue<Integer>();
        myQue.add(2);
        Stack stack = new Stack(5);
        /*StackItem stackItem1 = new StackItem(1);
        stack.push(stackItem1);
        StackItem stackItem2 = new StackItem(2);
        stack.push(stackItem2);
        StackItem stackItem3 = new StackItem(3);
        stack.push(stackItem3);

        stack.push(new StackItem(4));
        stack.printStack();
        stack.pop();
        stack.printStack();*/
        for(int i=0;i<5;i++){
            stack.push(new StackItem(i));
        }
        stack.printStack();
        stack.pop();
        System.out.println();
        stack.printStack();
      /*  BackpackProblem bóackpackProblem = new BackpackProblem();
        backpackProblem.setup();ó
        backpackProblem.solve();
        System.out.println(backpackProblem.getMaxValue());
        //50 4 12 17 18 13 20 20 15 14*/
///////////
        /*
        InsertionSort insertionSort = new InsertionSort();
        TimeMeasurementHelper.ExecutionTimeMeasure(insertionSort, true);
        BubbleSort bubbleSort1 = new BubbleSort();
        TimeMeasurementHelper.ExecutionTimeMeasure(bubbleSort1, true);
        CountingSort countingSort = new CountingSort();
        TimeMeasurementHelper.ExecutionTimeMeasure(countingSort, true);
        QuickSort quickSort = new QuickSort();
        TimeMeasurementHelper.ExecutionTimeMeasure(quickSort, true);

        HeapSort heapSort = new HeapSort();
        TimeMeasurementHelper.ExecutionTimeMeasure(heapSort, true);
*/
       /* QSort qSort = new QSort();
        qSort.setup();
        qSort.run();*/
/////////////////

        /*Newton n = new Newton();
        TimeMeasurementHelper.ExecutionTimeMeasure(n, true);
        TimeMeasurementHelper.ExecutionTimeMeasure(n, true);
        TimeMeasurementHelper.ExecutionTimeMeasure(n, true);
        TimeMeasurementHelper.ExecutionTimeMeasure(n, true);
        TimeMeasurementHelper.ExecutionTimeMeasure(n, true);
        //  System.out.println(n.factorial(40));
        System.out.println(n.nPoK(12, 7)); //792
        n.printNewtonTriangle(13);*/






    /*    BinarySearch binarySearch = new BinarySearch();
        TimeMeasurementHelper.ExecutionTimeMeasure(binarySearch, true);

        ListBinarySearch listBinarySearch = new ListBinarySearch();
        TimeMeasurementHelper.ExecutionTimeMeasure(listBinarySearch, true);*/
//        ListInsertionSort listInsertionSort = new ListInsertionSort();
//        TimeMeasurementHelper.ExecutionTimeMeasure(listInsertionSort,true);


      /*  insertionSort.setup();
        insertionSort.insertElementAt(2, 1);
        insertionSort.sort();*/

        //       ListInsertionSort myListIn = new ListInsertionSort();
        //       myListIn.setup();
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
