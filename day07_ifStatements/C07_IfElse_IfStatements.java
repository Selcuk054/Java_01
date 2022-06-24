package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElse_IfStatements {
    public static void main(String[] args) {
        /*bir onceki soruda kullanici negatif deger girerse uyaralim.

        not: birden fazla if-else if birbirne baglanmissa son durum onemlidir.
        eger else ile bitiyorsa butun ihtimaller kapsaniyor demektir
        ama else is ile bitiyorsa kapsanmayan durumlar olabilir.

         */
        Scanner scan=new Scanner (System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<0){
            System.out.println("Lutfen gecerli bir yas giriniz");
        }

        else if (yas<65) {
            System.out.println("Emekli olamazsin, "+ (65-yas)+" yil daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");
        }
    }
}
