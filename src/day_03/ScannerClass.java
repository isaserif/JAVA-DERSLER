package day_03;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
//      Kullanıcıdan data alma

        Scanner scan=new Scanner(System.in);
        System.out.print(" Adınız giriniz: ");
        String ad= scan.nextLine();// Kullanıcıdan gelen String tipinde isim verisi scan obj ini nextLine() methodu
        // ile atadık
        System.out.println("ad = " + ad);

//TASK >>>>>> Kullanıcıdan girdiği değere göre kare alanı ve çevresini hesaplayan bir code create ediniz.>>>>>>>>>>>>

        System.out.print("lütfen karenin bir kenar uzunluğunu giriniz ");
        int uzunluk=scan.nextInt();

        int karealanı=uzunluk*uzunluk;
        System.out.println("karealanı = " + karealanı);

        int kareçevresi=4*uzunluk;
        System.out.println("kareçevresi = " + kareçevresi);






    }
}
