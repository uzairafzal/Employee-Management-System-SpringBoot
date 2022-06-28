package com.example.demo.entity;

public class Admin {
    private int adminId;
    private String name;
    private String address;
    public Admin() {
        super();
    }

    public Admin(int adminId, String name, String address) {
        super();
        this.adminId = adminId;
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int employeeId) {
        this.adminId = employeeId;
    }
}
