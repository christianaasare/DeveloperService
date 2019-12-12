package io.turnatabl.DevelopersService.models;

public class Develop {
    private String name;
    private int id;
    private String phone;
    private String email;
    private String address;


    public Develop(){

    }

    public String getDevName() {
        return name;
    }

    public void setDevName(String name) {this.name = name;
    }

    public int getDevID() {
        return id;
    }

    public void setDevID(int id) {this.id = id;
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
                "dev_name='" + name + '\'' +
                ", developer_id=" + id +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
