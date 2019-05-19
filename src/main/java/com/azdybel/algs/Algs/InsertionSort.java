package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IInsertionSort;

public class InsertionSort implements IInsertionSort<Integer>, IAlgorithmRunner {

    private Integer[] table;
    private int sortedSize;

    @Override
    public int getSortedSize() {
        return sortedSize;
    }

    @Override
    public Integer getElementAtIndex(int index) {
        return table[index];
    }

    @Override
    public void insertElementAt(int index, Integer elementToInsert) {
        //czy index istnieje w tablicy
        //0...length-1 => i-1 => 1...length
        //pętla, która stworzy przestrzeń dla naszego elementu
        //wstawiamy w wolne miejsce elementToInsert

        System.out.println("test_insertElementAt");

        for (int i = table.length - 1; i > index; i--) {
            table[i] = table[i - 1];

        }
        table[index] = elementToInsert;

    }

    @Override
    public void sort() {


        int temp;
        for (int i = 1; i < table.length; i++) {
            for (int j = i; j > 0; j--) {
                if (table[j] < table[j - 1]) {
                    temp = table[j];
                    table[j] = table[j - 1];
                    table[j - 1] = temp;
                }
            }
        }
        for (int i : this.table) {
            System.out.println(i);
        }
    }

    @Override
    public void setup() {
        this.table = new Integer[5];
        this.table[0] = 4;
        this.table[1] = 3;
        this.table[2] = 2;
        this.table[3] = 5;
        this.table[4] = 7;

//        for(int i=0; i<5; i++){
//            this.table[i] = new Random(System.nanoTime()).nextInt();
//        }


    }

    @Override
    public void run() {


    }
}
