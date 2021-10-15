package com.example.activemqtest.model;

import java.util.Date;

public class Employee {

    private String FName;
    private String LNmae;
    private Long salary;
    private Date dateOfBirth;
    private Integer Age;

    public Employee() {
    }

    public Employee(String FName, String LNmae, Long salary, Date dateOfBirth, Integer age) {
        this.FName = FName;
        this.LNmae = LNmae;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        Age = age;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLNmae() {
        return LNmae;
    }

    public void setLNmae(String LNmae) {
        this.LNmae = LNmae;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
}
