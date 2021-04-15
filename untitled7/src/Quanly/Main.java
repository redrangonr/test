package Quanly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do{
            System.out.println("Nhập lựa chọn của bạn");
            System.out.println("Menu");
            System.out.println("1.Nhap thong tin ve khach tro");
            System.out.println("2.Hien thi danh sach");
            System.out.println("3.Xoa thong tin ve 1 khach tro");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
            }
        }while(choice!=0);
    }
}