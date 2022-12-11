package com.danverem.strategy;

public class ResultProcessorTest {
    public static void main(String[] args) {
        var resultProcessingMethod = new ResultProcessorTest().getResultProcessingMethod("Peloton");
        ResultProcessingContext context = new ResultProcessingContext(null);

        switch (resultProcessingMethod) {
            case GRADE_BASED:
                context.setProcessor(new GradeBasedResultProcessor());
                break;
            case SCORE_BASED:
                context.setProcessor(new ScoreBasedResultProcessor());
                break;
            case AVERAGE_BASED:
                context.setProcessor(new AverageBasedResultProcessor());
                break;
            // add additional cases here as needed
            default:
                throw new IllegalArgumentException("Invalid result processing method");
        }

        context.processResult();
    }

    public ResultProcessingMethod getResultProcessingMethod(String schoolId) {
        return ResultProcessingMethod.AVERAGE_BASED;
    }
}
