package com.tnsif.day5.ConstructorScanners;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String str = sc.nextLine();
        System.out.println("Your Name is " + str);
    }
}

