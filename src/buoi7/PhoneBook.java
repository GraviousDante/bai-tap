package buoi7;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList;
    public String sdt;

    public void insertPhone(){
        System.out.println("Nhap so dien thoai: ");
        Scanner scanner = new Scanner(System.in);
        sdt = scanner.nextLine();
    }
}
