package day07_ifStatements;

import java.util.Scanner;

public class Q01_If {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi= scan.nextInt();

        if(girilenSayi%2==0) {
            System.out.println("Girilen Sayi Cifttir");

        }
        if (girilenSayi%2!=0) {
            System.out.println("Girilen Sayi Tektir");
        }



    }
}
