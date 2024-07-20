package com.Tools;

public class Main {
    public static void main(String[] args) {
        Method Obj1 = new Method();
       int result =  Obj1.GetAdd(2,3);
       System.out.println("The result is : "+result);

       Method.Subtract Obj2 = new Method.Subtract();
      int Subtract =  Obj2.Sub(4,5);
      System.out.println("The result is : "+Subtract);


    }
}
