package day07_ifStatements;

public class C02_BasitifStatements {

    public static void main(String[] args) {
        int sayi=-25;
        if(sayi>0) {
            System.out.println("sayi pozitif");
        }
        if (sayi%2==0) {

            System.out.println("sayi cift");
        }
        if (sayi%5==0) {
            System.out.println("sayi 5'in katidir");
        }

        /* Basit if cumleleri kodun diger parcalarindan bagimsizdir
        sadece bir sart kontrol eder, sart saglaniyorsa, if body calisir, yoksa calismaz
        birden fazla basit if cumlesi varsa girilen sarta bagli olarak tumunde if body si calisabilir kismen if bodyleri calisabilir
        yada hicbir if body si calismayabilir
         */

    }

}
