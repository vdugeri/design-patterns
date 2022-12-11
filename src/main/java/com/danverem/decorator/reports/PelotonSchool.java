package com.danverem.decorator.reports;

public class PelotonSchool {
    public static void main(String[] args) {
        Report report = new BaseReport(new ReportData());
        System.out.println(report.processResults());

        Report reportWithGrades = new Grades(new BaseReport(new ReportData()));
        System.out.println(reportWithGrades.processResults());

        Report reportWithGradesAndPosition = new Position(new Grades(new BaseReport(new ReportData())));
        System.out.println(reportWithGradesAndPosition.processResults());

        Report reportWithGradesAndComments = new Grades(new Comments(new BaseReport(new ReportData())));
        System.out.println(reportWithGradesAndComments.processResults());

        Report reportWithGradesAndAverage = new Grades(new Average(new BaseReport(new ReportData())));
        System.out.println(reportWithGradesAndAverage.processResults());

        Report reportWithGradesAverageAndPosition = new Grades(new Average(new Position(new BaseReport(new ReportData()))));
        System.out.println(reportWithGradesAverageAndPosition.processResults());
    }
}
