package io.turnatabl.DevelopersService.models;

public class Report {
    private String report_date;
    private int total_hours;

    public Report(){
    }

    public String getReport_date() {
        return report_date;
    }

    public void setReport_date(String report_date) {
        this.report_date = report_date;
    }

    public int getTotal_hours() {
        return total_hours;
    }

    public void setTotal_hours(int total_hours) {
        this.total_hours = total_hours;
    }
}
