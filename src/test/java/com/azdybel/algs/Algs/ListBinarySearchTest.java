package com.azdybel.algs.Algs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ListBinarySearchTest {

    private ArrayList<Integer> list;
    private Integer valueToSearch;

    @Before
    public void setUp() throws Exception {
        ArrayList<Integer> myarray = new ArrayList<Integer>();
        myarray.add(4);
        myarray.add(3);
        myarray.add(2);
        myarray.add(5);
        myarray.add(7);
        this.list = myarray;
        this.valueToSearch = 2;
        Collections.sort(this.list);//2,3,4,5,7
        System.out.print("ListBinarySearchTest :");
    }

    @Test
    public void binarySearch() {
//        ListInsertionSort listInsertionSort = new ListInsertionSort();
        ListBinarySearch listBinarySearch = new ListBinarySearch();
        int result = listBinarySearch.binarySearch(this.list, this.valueToSearch);

        Assert.assertEquals(0, result);
    }
}