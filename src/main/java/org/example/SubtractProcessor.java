package org.example;

public class SubtractProcessor implements Processor{
    @Override
    public int processor(int arg1, int arg2) {
        int subtract = arg1 - arg2;
        return subtract;
    }
}
