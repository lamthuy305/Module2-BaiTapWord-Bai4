package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;
        BookManagement bookManagement = new BookManagement();
        do {
            menu();
            System.out.println("Nhập sự lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("---Danh sách thẻ mượn sách---");
                    bookManagement.displayAllTheMuonSach();
                    break;
                }
                case 2: {
                    scanner.nextLine();
                    System.out.println("---Thêm thẻ mượn sách---");
                    case2(bookManagement);
                    break;
                }
                case 3: {
                    scanner.nextLine();
                    System.out.println("---Cập nhật thẻ mượn sách: ");
                    case3(bookManagement);
                    break;
                }
                case 4: {
                    scanner.nextLine();
                    System.out.println("---Xóa thẻ mượn sách---");
                    case4(bookManagement);
                    break;
                }
                case 5: {
                    scanner.nextLine();
                    System.out.println("---Tìm kiếm và tra cứu thẻ mượn sách theo mã sinh viên---");
                    case5(bookManagement);
                    break;
                }
                case 0: {
                    System.out.println("---Bạn đã thoát Menu---");
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ, nhập lại: ");
                }
            }
        } while (choice != 0);

    }

    private static void case5(BookManagement bookManagement) {
        System.out.println("Nhập mã sinh viên cần tra cứu: ");
        String maSinhVien = scanner.nextLine();
        int index = bookManagement.timKiemThMuonSach(maSinhVien);
        if (index == -1) {
            System.out.println("Không có thẻ mượn sách của sinh viên này !!!");
        } else {
            bookManagement.displayTheMuonSach(index);
        }
    }

    private static void case4(BookManagement bookManagement) {
        System.out.println("Nhập vị trí muốn xóa:");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < 0 || index >= bookManagement.size()) {
            System.out.println("Vị trí xóa không hợp lệ");
        } else {
            bookManagement.removeTheMuonSach(index);
        }
    }

    private static void case3(BookManagement bookManagement) {
        System.out.println("Nhập vị trí muốn sửa: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < 0 || index >= bookManagement.size()) {
            System.out.println("Vị trí sửa vào không hợp lệ");
        } else {
            TheMuonSach theMuonSach = getBookManagement();
            bookManagement.updateTheMuonSach(index, theMuonSach);
        }
    }

    private static void case2(BookManagement bookManagement) {
        System.out.println("Nhập vị trí muốn thêm: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < 0 || index > bookManagement.size()) {
            System.out.println("Vị trí thêm vào không hợp lệ");
        } else {
            TheMuonSach theMuonSach = getBookManagement();
            bookManagement.addNewTheMuonSach(index, theMuonSach);
        }
    }

    private static TheMuonSach getBookManagement() {
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        String maSinhVien = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập lớp học: ");
        String lopHoc = scanner.nextLine();
        System.out.println("Nhập số sách mượn: ");
        String soSachMuon = scanner.nextLine();
        System.out.println("Nhập ngày mượn: ");
        String ngayMuon = scanner.nextLine();
        System.out.println("Nhập ngày trả: ");
        String ngayTra = scanner.nextLine();
        System.out.println("Nhập số hiệu sách: ");
        String soHieuSach = scanner.nextLine();
        return new TheMuonSach(name, maSinhVien, dateOfBirth, lopHoc, soSachMuon, ngayMuon, ngayTra, soHieuSach);
    }

    private static void menu() {
        System.out.println("---Menu quản lý mượn sách---");
        System.out.println("1. Hiển thị tất cả thẻ mượn sách");
        System.out.println("2. Thêm thẻ mượn sách");
        System.out.println("3. Cập nhật thẻ mượn sách");
        System.out.println("4. Xóa thẻ mượn sách");
        System.out.println("5. Tìm kiếm và tra cứu theo Mã sinh viên");
        System.out.println("0. Thoát chương trình");
    }
}
