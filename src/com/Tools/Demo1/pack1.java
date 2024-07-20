package com.Tools.Demo1;
import com.Tools.Method;


public class pack1 {
    public static void main(String[] args) {
        Method obj = new Method();
        int T = obj.GetAdd(2,3);
        System.out.println(T);

       Method.Subtract obj2 = new Method.Subtract();
        int Subtract = obj2.Sub(8,3);
        System.out.println(Subtract);





    }
}
