package day07_ifStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun = scan.next().toLowerCase();
        //Pazar, pazar,PAZAR,PAzar ,pazAR??? bilemeyiz.
        // tolowerCase yazdigimiz icin pazar yapacak.

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {

            System.out.println("Girilen gun HAFTASONU");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
            || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                ||girilenGun.equals("cuma")) {
            System.out.println("Girilen gun HAFTAICI");
        }
        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                ||girilenGun.equals("cuma")|| girilenGun.equals("cumartesi")
                || girilenGun.equals("pazar"))) {
            System.out.println("Lutfen gecerli bir gun giriniz");
        }


    }
}