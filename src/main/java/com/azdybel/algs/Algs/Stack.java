package com.azdybel.algs.Algs;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IStack;

public class Stack implements IStack, IAlgorithmRunner {
    private int top = -1;
    private StackItem[] stackItems;

    public Stack(int stackSize) {
        this.stackItems = new StackItem[stackSize];
    }

    @Override
    public void setup() {
        Stack stack = new Stack(5);


    }

    @Override
    public void run() {
        StackItem stackItem=new StackItem(1);
        this.push(stackItem);
        stackItem.setValue(2);
        this.push(stackItem);

    }

    @Override
    public void push(StackItem item) {
       if(top!=stackItems.length-1); //throw new StackOverflowError();

//        top++;
        this.stackItems[++top] = item;
    }

    @Override
    public StackItem pop() {
if(Empty())return null;// throw new ArrayIndexOutOfBoundsException();
        //        StackItem stackItem = this.stackItems[top];
//        top--;
//        return stackItem;
       return stackItems[top--];
    }

    @Override
    public boolean Empty() {
        return top < 0;
    }

    @Override
    public StackItem top() {
        return this.stackItems[top];
    }

    @Override
    public void printStack() {
//        int j=0;
//        for (StackItem stackItem : stackItems) {
//
//            System.out.println(stackItem.getValue());
//       j++;
  //      if(j>top)break;

//        }
        for(int i=top;i>=0;i--){
            System.out.println(stackItems[i].getValue());
        }
//        for(int i=0;i<=top;i++){
//            System.out.println(stackItems[i].getValue());
//        }
//int i=top;
//        while(i>=0){
//            System.out.println(stackItems[i].getValue());
//            i--;
//        }
    }
}
