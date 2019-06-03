package com.azdybel.algs.Algs;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor()
@ToString
public class StackItem {

  @NonNull  private int value;
//          private int value; //dynamiczny konstruktor () tych bez @NonNull
//  @NonNull  private int value;


//    public StackItem(int value) {
//        this.value = value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }

   /* public int getValue() {
        return value;
    }*/
}
