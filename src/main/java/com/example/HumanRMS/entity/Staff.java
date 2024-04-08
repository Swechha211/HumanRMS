package com.example.HumanRMS.entity;

public class Staff {
    private String staffId;
    private String name;
    private String password;
    private String personalPhone;
    private String emergencyContactNumber;
    private String position;

    private long joinDate;
    private long contactRenewDate;
    private double salary;

    public Staff(String staffId, String name, String password, String personalPhone, String emergencyContactNumber, String position, long joinDate, long contactRenewDate, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.password = password;
        this.personalPhone = personalPhone;
        this.emergencyContactNumber = emergencyContactNumber;
        this.position = position;
        this.joinDate = joinDate;
        this.contactRenewDate = contactRenewDate;
        this.salary = salary;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(long joinDate) {
        this.joinDate = joinDate;
    }

    public long getContactRenewDate() {
        return contactRenewDate;
    }

    public void setContactRenewDate(long contactRenewDate) {
        this.contactRenewDate = contactRenewDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
