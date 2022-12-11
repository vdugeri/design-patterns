package com.danverem.decorator.reports;

public class Grades extends MetricsDecorator {
    Report processor;

    public Grades(Report processor) {
        this.processor = processor;
    }
    @Override
    public ReportData processResults() {
        ReportData report = processor.processResults();
        report.grades = "A";

        return report;
    }
}
