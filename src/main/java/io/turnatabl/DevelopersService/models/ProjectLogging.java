package io.turnatabl.DevelopersService.models;


public class ProjectLogging {
    private String date;
    private int project_hours;
    private int emp_id;
    private int project_id;
    private String vacation;
    private String sick;
    private int volunteering_hours;


    public ProjectLogging(){

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getProject_hours() {
        return project_hours;
    }

    public void setProject_hours(int project_hours) {
        this.project_hours = project_hours;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getVacation() { return vacation; }

    public void setVacation(String vacation) { this.vacation = vacation; }

    public String getSick() { return sick; }

    public void setSick(String sick) { this.sick = sick; }

    public int getVolunteering_hours() { return volunteering_hours;  }

    public void setVolunteering_hours(int volunteering_hours) { this.volunteering_hours = volunteering_hours; }
}
