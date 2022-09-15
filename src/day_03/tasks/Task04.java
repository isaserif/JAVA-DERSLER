package day_03.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner scan =new Scanner(System.in);
        System.out.print("isminizi giriniz: ");
        String isim=scan.nextLine();
        System.out.print("soyisminizi giriniz: ");
        String soyisim=scan.nextLine();
        System.out.print("yaşınızı giriniz: ");
        int yaş=scan.nextInt();
        System.out.print("kilonuzu giriniz: ");
        int kilo=scan.nextInt();
        System.out.print("boyunuzu giriniz: ");
        int boy=scan.nextInt();
        System.out.print("spor salonuna kaç ay devam edeceksiniz: ");
        int ay=scan.nextInt();
        int aylıkUcret=20;
        int ToplamUcret=aylıkUcret*ay;
        System.out.println("ToplamUcretiniz = " + ToplamUcret+" $");


    }
}
