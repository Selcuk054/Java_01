package day07_ifStatements;

public class C03_BasitifStatements {

    public static void main(String[] args) {
        /* Bir if cumlesinde curlybarces kullanilmazsa  java ilk satiri sart ile baglar sonraki satirlr bagimsiz olur
          Eger birden fazla satir ayni if sartina baglanmis ise mutlaka { kullanmaliyiz
         */
        int sayi=23;
        if(sayi>0)
            System.out.println("sayi pozitif"); //degere bagli
            System.out.println("Positif kalacaktir"); //herzaman calisacak

        if (sayi%2==0)

            System.out.println("sayi cift"); //degere bagli
            System.out.println("cift kalacaktir"); //herzaman calisir

        if (sayi%5==0)
            System.out.println("sayi 5'in katidir"); //degere bagli


    }
}
