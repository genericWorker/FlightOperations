package edu.dccc.flightops;

import edu.dccc.utils.CSVTemplate;

public class Employee implements CSVTemplate {

    private String id;
    private String name;
    private String role;
    private String salary;

    public Employee(String id, String name, String role, String salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override

    public String toString() {
        return "\nID=" + getId() + "::Name" + getName() + "::Role=" + getRole() + "::Salary=" + getSalary();
    }

    public String toCSV() {
        return id + "," +  name + "," + role + "," + salary;
    }

    public void fromCSV(String[] parts) { // Logic for loading
        this.id =  parts[0];
        this.name = parts[1];
        this.role = parts[2];
        this.salary = parts[3];
    }
}