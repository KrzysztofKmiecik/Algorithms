package com.azdybel.algs.Algs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
    private Integer[] table;

    @Before
    public void setUp() throws Exception {
        this.table = new Integer[5];
        this.table[0] = 4;
        this.table[1] = 3;
        this.table[2] = 2;
        this.table[3] = 5;
        this.table[4] = 7;
        System.out.print("BinarySearchTest :");
    }

    @Test
    public void binarySearch() {
        BinarySearch binarySearch = new BinarySearch();
        Assert.assertEquals(3, binarySearch.binarySearch(table, 5));
        Assert.assertNotEquals(3, binarySearch.binarySearch(table, 2));
    }
}