package com.nikhil.employee.models;

public class Employee {

    private int id;
    private String name;
    private String email;

    public Employee (int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String displayEmployeeDetails(){
        return "Employee Id : "+ id + "\nEmployee Name : " + name + "\nEmployee Email : " + email + "\n";
    }

}
