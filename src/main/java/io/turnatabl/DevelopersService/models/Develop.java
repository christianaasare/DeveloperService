package io.turnatabl.DevelopersService.models;

public class Develop {
    private String name;
    private int developer_id;
    private String phone;
    private String email;
    private String address;


    public Develop(){

    }

    public String getDevName() {
        return name;
    }

    public void setDevName(String devName) {this.name = name;
    }

    public int getDevID() {
        return developer_id;
    }

    public void setDevID(int devID) {this.developer_id = developer_id;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) { this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {this.address = address;
    }

    @Override
    public String toString() {
        return "Develop{" +
                "name='" + name + '\'' +
                ", developer_id=" + developer_id +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
