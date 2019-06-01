package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IBackpackProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackpackProblem implements IBackpackProblem, IAlgorithmRunner {
    private List<Item> items = new ArrayList<>();
    private int capacity;
    private int numberOfElements;
    private int numberOfItems;
    private int maxValue;

    @Override
    public void addItem(int weight, int value) {
//        System.out.println(weight+ " "+value);
////        items[index]=weight/value*10;
        items.add(new Item(weight, value));

    }

    @Override
    public void solve() {

//        this.sort();
//        for(int i=items.length;i>0;i--){
        //////////////////////////

        items.sort(Item::compareTo);
        while (capacity > 0 && items.size() > 0 && items.get(0).getWeight() <= capacity) {


            Item i = items.get(0);
            capacity -= i.getWeight();
            maxValue += i.getValue();
            items.remove(i);
        }


    }

    /* public void sort() {
         int temp;
         for (int i = 1; i <items.length; i++) {
             for (int j = i; j > 0; j--) {
                 if (items[j] < items[j - 1]) {
                     temp = items[j];
                     items[j] = items[j - 1];
                     items[j - 1] = temp;
                 }
             }
         }
         this.items = items;


     }*/
    @Override
    public int getMaxValue() {
        return maxValue;
    }

    @Override
    public void setup() {
       /* Scanner in = new Scanner(System.in);
        System.out.println("Podaj capacity");
        capacity = in.nextInt();
        System.out.println("Podaj numberOfItems");
        numberOfItems = in.nextInt();
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Podaj Wage i Wartosc");
            addItem(in.nextInt(), in.nextInt());
        }*/
        Scanner in = new Scanner(System.in);
        capacity = in.nextInt();
        numberOfItems = in.nextInt();
        for (int i = 0; i < numberOfItems; i++) {
            addItem(in.nextInt(), in.nextInt());
        }


    }

    @Override
    public void run() {

    }
}
