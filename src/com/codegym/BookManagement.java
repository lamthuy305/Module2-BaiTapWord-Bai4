package com.codegym;

public class BookManagement {
    private TheMuonSach[] theMuonSach = new TheMuonSach[0];

    public TheMuonSach[] getTheMuonSach() {
        return theMuonSach;
    }

    public void setTheMuonSach(TheMuonSach[] theMuonSach) {
        this.theMuonSach = theMuonSach;
    }

    public int size() {
        return theMuonSach.length;
    }

    public void displayAllTheMuonSach() {
        for (int i = 0; i < size(); i++) {
            System.out.println(theMuonSach[i]);
        }
    }

    public void addNewTheMuonSach(int index, TheMuonSach theMuonSach) {
        TheMuonSach[] newTheMuonSach = new TheMuonSach[size() + 1];
        for (int i = 0; i < newTheMuonSach.length; i++) {
            if (i < index) {
                newTheMuonSach[i] = this.theMuonSach[i];
            } else if (i == index) {
                newTheMuonSach[i] = theMuonSach;
            } else {
                newTheMuonSach[i] = this.theMuonSach[i - 1];
            }
        }
        this.theMuonSach = newTheMuonSach;
    }

    public void updateTheMuonSach(int index, TheMuonSach theMuonSach) {
        this.theMuonSach[index] = theMuonSach;
    }

    public void removeTheMuonSach(int index){
        TheMuonSach[] newTheMuonSach = new TheMuonSach[size() - 1];
        for (int i = 0; i < newTheMuonSach.length; i++) {
            if (i < index) {
                newTheMuonSach[i] = this.theMuonSach[i];
            } else {
                newTheMuonSach[i] = this.theMuonSach[i + 1];
            }
        }
        this.theMuonSach = newTheMuonSach;
    }

    public int timKiemThMuonSach(String maSinhVien){
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (this.theMuonSach[i].getMaSinhVien().equals(maSinhVien)) {
                index = i;
            }
        }
        return index;
    }

    public void displayTheMuonSach(int index) {
        System.out.println(this.theMuonSach[index]);
    }

}
