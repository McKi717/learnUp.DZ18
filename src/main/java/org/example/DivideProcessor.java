package org.example;

public class DivideProcessor implements Processor{
    @Override
    public int processor(int arg1, int arg2) {
        int divide = arg1 / arg2;
        return divide;
    }
}
