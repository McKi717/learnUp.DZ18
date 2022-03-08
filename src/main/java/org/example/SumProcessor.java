package org.example;

public class SumProcessor implements Processor {
    @Override
    public int processor(int arg1, int arg2) {
        int sum = arg1 + arg2;
        return sum;
    }
}
