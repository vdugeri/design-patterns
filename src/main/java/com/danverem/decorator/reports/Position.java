package com.danverem.decorator.reports;

public class Position extends MetricsDecorator {
    Report processor;

    public Position(Report processor) {
        this.processor = processor;
    }
    @Override
    public ReportData processResults() {
        ReportData report = processor.processResults();
        report.position = "1st";
        return report;
    }
}
