package com.example.activemqtest.model;

public class Department {
    private Integer DeptId;
    private String DeptName;
    private Integer NoOfEmployees;

    public Department() {
    }

    public Department(Integer deptId, String deptName, Integer noOfEmployees) {
        DeptId = deptId;
        DeptName = deptName;
        NoOfEmployees = noOfEmployees;
    }

    public Integer getDeptId() {
        return DeptId;
    }

    public void setDeptId(Integer deptId) {
        DeptId = deptId;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public Integer getNoOfEmployees() {
        return NoOfEmployees;
    }

    public void setNoOfEmployees(Integer noOfEmployees) {
        NoOfEmployees = noOfEmployees;
    }
}
