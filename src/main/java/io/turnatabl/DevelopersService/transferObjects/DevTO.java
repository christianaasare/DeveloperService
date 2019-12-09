package io.turnatabl.DevelopersService.transferObjects;

import java.util.List;

public class DevTO {
    private String DevName;
    private int DevID;
    private double Time;
    private String Phone;
    private String Email;
    private List currentProject;

    public DevTO(){

    }

    public String getDevName() {
        return DevName;
    }

    public void setDevName(String devName) {this.DevName = devName;
    }

    public int getDevID() {
        return DevID;
    }

    public void setDevID(int devID) {this.DevID = devID;
    }

    public double getTime() {
        return Time;
    }

    public void setTime(double time) {this.Time = time;
    }

    public List getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(List currentProject) {
        this.currentProject = currentProject;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) { this.Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {this.Email = email;
    }
}
