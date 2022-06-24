package day07_ifStatements;

public class C01_andOperatorleri {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0&& b<20 &&c >=b); //true

        System.out.println(a<0&& b<20 &&c >=b); //false


        System.out.println(a<0 & b<20 & c <b); //false tek ve isareti digerlernede bakmak istiyor fakat ikiand operatoru
        // okumaya basladigi yerde ilk false buldugunda artik sonucun false olacagini bilir ve
        // geriye kalan sartlari incelemez.
        // bu calisma usulu and and operatorune gore daha yavastir.



    }
}
