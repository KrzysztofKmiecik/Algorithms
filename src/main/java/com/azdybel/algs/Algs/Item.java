package com.azdybel.algs.Algs;

public class Item implements Comparable<Item> {

    private int weight;
    private int value;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public int compareTo(Item o) {
        double o1ratio = this.value / this.weight;
        double o2ratio = o.value / o.weight;
        return o1ratio < o2ratio ? 1 : -1;
//        //        return this.value < o.value ? 1 : -1;
    }

//    public int compareTo(Item o) {
//        double o1ratio = this.value / this.weight;
//        double o2ratio = o.value / o.weight;
//        return o1ratio < o2ratio ? 1 : -1;
//        //        return this.value < o.value ? 1 : -1;
//
//    }

}
