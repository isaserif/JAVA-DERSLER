package day_03.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz: ");
        double boy=scan.nextDouble();
        System.out.print("lütfen kilonuzu giriniz: ");
        double kilo=scan.nextDouble();

        double vücutKitleIndexi=kilo/(boy*boy);
        System.out.println("vücutKitleIndexi = " + vücutKitleIndexi);
        System.out.println("tamsayı değeri: "+Math.round(vücutKitleIndexi));


    }
}
