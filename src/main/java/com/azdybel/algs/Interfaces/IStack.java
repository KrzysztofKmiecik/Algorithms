package com.azdybel.algs.Interfaces;

import com.azdybel.algs.Algs.StackItem;

public interface IStack {
    void push(StackItem item);
    StackItem pop();
    boolean Empty();
    StackItem top();
    void printStack();

}
