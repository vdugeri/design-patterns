package com.danverem.decorator.reports;

public class Comments extends MetricsDecorator {
    Report report;

    public Comments(Report report) {
        this.report = report;
    }
    @Override
    public ReportData processResults() {
        ReportData report = this.report.processResults();
        report.comments = "Excellent Result";

        return report;
    }
}
