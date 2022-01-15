package com.codegym;

public class Student {
    private String name;
    private String maSinhVien;
    private String dateOfBirth;
    private String lopHoc;

    public Student() {
    }

    public Student(String name, String maSinhVien, String dateOfBirth, String lopHoc) {
        this.name = name;
        this.maSinhVien = maSinhVien;
        this.dateOfBirth = dateOfBirth;
        this.lopHoc = lopHoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.maSinhVien + ", " + this.dateOfBirth + ", " + this.lopHoc;
    }
}
