package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {
    private List<TheMuonSach> theMuonSachs = new ArrayList<>();

    public int size() {
        return theMuonSachs.size();
    }

    public void displayAllTheMuonSach() {
        for (int i = 0; i < size(); i++) {
            System.out.println(theMuonSachs.get(i));
        }
    }

    public void addNewTheMuonSach(int index, TheMuonSach theMuonSach) {
        theMuonSachs.add(index, theMuonSach);
    }

    public void updateTheMuonSach(int index, TheMuonSach theMuonSach) {
        theMuonSachs.set(index, theMuonSach);
    }

    public void removeTheMuonSach(int index) {
        theMuonSachs.remove(index);
    }

    public int timKiemThMuonSach(String maSinhVien) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (this.theMuonSachs.get(i).getMaSinhVien().equals(maSinhVien)) {
                index = i;
            }
        }
        return index;
    }

    public void displayTheMuonSach(int index) {
        System.out.println(this.theMuonSachs.get(index));
    }

}
