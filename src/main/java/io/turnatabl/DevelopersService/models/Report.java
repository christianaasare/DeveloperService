package io.turnatabl.DevelopersService.models;

public class Report {
    private String logged_date;
    private int total_project_hours;
    private int total_volunteering_hours;
    public Report(){
    }

    public String getLogged_date() {
        return logged_date;
    }

    public void setLogged_date(String logged_date) {
        this.logged_date = logged_date;
    }

    public int getTotal_project_hours() {
        return total_project_hours;
    }

    public void setTotal_project_hours(int total_project_hours) {
        this.total_project_hours = total_project_hours;
    }

    public int getTotal_volunteering_hours() {
        return total_volunteering_hours;
    }

    public void setTotal_volunteering_hours(int total_volunteering_hours) {
        this.total_volunteering_hours = total_volunteering_hours;
    }
}
