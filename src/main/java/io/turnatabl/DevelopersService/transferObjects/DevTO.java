package io.turnatabl.DevelopersService.transferObjects;

import java.util.List;

public class DevTO {
    private String DevName;
    private int DevID;
    private String Phone;
    private String Email;
    private String Address;


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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {this.Address = address;
    }
}
