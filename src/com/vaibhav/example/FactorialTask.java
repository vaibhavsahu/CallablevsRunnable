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

            try {
                if(number < 0) {
                    throw new InvalidParameterException("Number should be positive");
                }
            } catch (InvalidParameterException e) {
                e.printStackTrace();
            }

        for (int i = number; i >= 1 ; i--) {
            factor *= i;
        }
        return factor;
    }
}
