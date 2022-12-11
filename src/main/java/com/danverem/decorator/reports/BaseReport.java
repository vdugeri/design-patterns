package com.danverem.decorator.reports;

public class BaseReport extends Report {
    private final ReportData report;

    public BaseReport(ReportData reportData) {
        this.report = reportData;
    }
    @Override
    public ReportData processResults() {
        this.report.baseReport = "All subject names and CA names";
        return report;
    }
}

