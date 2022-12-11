package com.danverem.strategy;

public class ResultProcessingContext {
    private ResultProcessor processor;

    public ResultProcessingContext(ResultProcessor processor) {
        this.processor = processor;
    }

    public void setProcessor(ResultProcessor processor) {
        this.processor = processor;
    }

    public void processResult() {
        processor.processResult();
    }
}
