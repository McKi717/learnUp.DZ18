package org.example;

public class Calculator {
    private final SumProcessor sumProcessor;
    private final SubtractProcessor  subtractProcessor;
    private final DivideProcessor divideProcessor;
    private final MultiplyProcessor multiplyProcessor;

    public Calculator(SumProcessor sumProcessor, SubtractProcessor subtractProcessor, DivideProcessor divideProcessor, MultiplyProcessor multiplyProcessor) {
        this.sumProcessor = sumProcessor;
        this.subtractProcessor = subtractProcessor;
        this.divideProcessor = divideProcessor;
        this.multiplyProcessor = multiplyProcessor;
    }

    public int sum (int arg1, int arg2){
        return sumProcessor.processor(arg1, arg2);
    }

    public int subtract (int arg1, int arg2){
        return subtractProcessor.processor(arg1, arg2);
    }

    public int divide (int arg1, int arg2){
        return divideProcessor.processor(arg1, arg2);
    }

    public int multiply (int arg1, int arg2){
        return multiplyProcessor.processor(arg1, arg2);
    }

    }
