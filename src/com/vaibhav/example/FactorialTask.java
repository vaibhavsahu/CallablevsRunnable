package com.vaibhav.example;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable {

    int number;

    public FactorialTask(int n){
        this.number = n;
    }

    @Override
    public Integer call() throws Exception {
        int factor = 1;
        for (int i = number; i >= 1 ; i--) {
            factor *= i;
        }
        return factor;
    }
}
