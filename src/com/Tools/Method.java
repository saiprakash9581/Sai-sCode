package com.Tools;


public class Method {
    private int Add(int a, int b) {
        return a + b;
    }

    public int GetAdd(int a, int b) {
        return Add(a, b);
    }

    public void SetAdd(int a, int b) {
        this.Add(a, b);
    }

    public static class Subtract extends Method {
        public int Sub(int a, int b) {
            return a - b;

        }
    }
}

