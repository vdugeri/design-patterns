package com.danverem.decorator.reports;

public class Average extends MetricsDecorator {
    Report report;

    public Average(Report report) {
        this.report = report;
    }

    @Override
    public ReportData processResults() {
        ReportData report = this.report.processResults();
        report.average = 78.5;

        return report;
    }
}
