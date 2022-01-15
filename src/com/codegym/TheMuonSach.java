package com.codegym;

public class TheMuonSach extends Student{
    private String soSachMuon;
    private String ngayMuon;
    private String ngayTra;
    private String soHieuSach;

    public TheMuonSach(){
    }

    public TheMuonSach(String soSachMuon, String ngayMuon, String ngayTra, String soHieuSach) {
        this.soSachMuon = soSachMuon;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.soHieuSach = soHieuSach;
    }

    public TheMuonSach(String name, String maSinhVien, String dateOfBirth, String lopHoc, String soSachMuon, String ngayMuon, String ngayTra, String soHieuSach) {
        super(name, maSinhVien, dateOfBirth, lopHoc);
        this.soSachMuon = soSachMuon;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.soHieuSach = soHieuSach;
    }

    public String getSoSachMuon() {
        return soSachMuon;
    }

    public void setSoSachMuon(String soSachMuon) {
        this.soSachMuon = soSachMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    @Override
    public String toString() {
        return super.toString() + ", "+this.soSachMuon+", "+this.ngayMuon+", "+ this.ngayTra+", "+this.soHieuSach;
    }
}
