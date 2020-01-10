package io.turnatabl.DevelopersService.models;

public class Report {
    private String logged_date;
    private int sum;

    public Report(){
    }

    public String getLogged_date() {
        return logged_date;
    }

    public void setLogged_date(String logged_date) {
        this.logged_date = logged_date;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
