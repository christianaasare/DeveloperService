package io.turnatabl.DevelopersService.models;

public class Develop {
    private String emp_name;
    private int emp_id;
    private String emp_phone;
    private String emp_email;
    private String emp_address;
    private String emp_role;


    public Develop(){

    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {this.emp_name = emp_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) { this.emp_id = emp_id;
    }



    public String getEmp_phone() {
        return emp_phone;
    }

    public void setEmp_phone(String emp_phone) { this.emp_phone = emp_phone;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {this.emp_email = emp_email;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {this.emp_address = emp_address;
    }

    public String getEmp_role() {
        return emp_role;
    }

    public void setEmp_role(String emp_role) {
        this.emp_role = emp_role;
    }

    @Override
    public String toString() {
        return "Develop{" +
                "emp_name='" + emp_name + '\'' +
                ", emp_id=" + emp_id +
                ", phone='" + emp_phone + '\'' +
                ", email='" + emp_email + '\'' +
                ", address='" + emp_address + '\'' +
                '}';
    }
}
