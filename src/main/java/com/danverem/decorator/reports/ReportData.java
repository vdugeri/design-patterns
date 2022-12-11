package com.danverem.decorator.reports;

public class ReportData {
    String baseReport = "base reports";
    String grades;
    String position;
    String comments;
    String behaviourMetrics;
    Double average;

    @Override
    public String toString() {
        return "{" +
            "baseReport=" + baseReport +
            ",grades=" + grades +
            ",position=" + position +
            ",comments=" + comments +
            ",behaviourMetrics=" + behaviourMetrics +
            "}";
    }
}
