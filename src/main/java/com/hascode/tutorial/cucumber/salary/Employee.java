package com.hascode.tutorial.cucumber.salary;

public class Employee {
    private int id;
    private String user;
    private float salary;

    public Employee(int id, String user, float salary) {
        this.id = id;
        this.user = user;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        return user.equals(employee.user);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + user.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    // constructor, getter, setter ommitted
}