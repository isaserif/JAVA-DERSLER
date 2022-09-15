package day_03.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen a giriniz: ");
        int a=scan.nextInt();
        System.out.print("lütfen b giriniz: ");
        int b=scan.nextInt();
        System.out.println("lütfen c giriniz");
        int c= scan.nextInt();
double sonuç=(a*a)-(b*b)/c*3;
        System.out.println("sonuç: "+Math.round(sonuç));




    }
}
