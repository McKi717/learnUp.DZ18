package org.example;

public class MultiplyProcessor implements Processor{
    @Override
    public int processor(int arg1, int arg2) {
        int multiply = arg1 * arg2;
        return multiply;
    }
}
