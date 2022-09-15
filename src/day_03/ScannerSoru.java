package day_03;

import java.util.Scanner;

public class ScannerSoru {
    public static void main(String[] args) {
        /*TASK >> Kullanıcının günde içtiği çay ve kullandığı şeker değerine göre
bir yılda kaç kğ şeker kullandığını hesaplayan bir code create ediniz...
        1 şeker 1.7 gr
        örenek: input : çay sayısı: 10,  şeker sayısı:2
        output: yılda 12.41 kg şeker kullanıyorsunuz.
 */
        Scanner scan=new Scanner(System.in);
        System.out.print("günlük içtiğiniz çay sayısını giriniz");

        int çay=scan.nextInt();
      //  double birBardakSekerMiktarıgr= 1.7*2;
      //  System.out.println("birBardakSekerMiktarıgr = " + birBardakSekerMiktarıgr+"gr");
      //  double günlükŞekerMiktarı=birBardakSekerMiktarıgr*10;
     //   System.out.println("günlükŞekerMiktarı = " + günlükŞekerMiktarı);
     //   double yıllıkŞekerMiktarı=günlükŞekerMiktarı*365;
     //   System.out.println("yıllıkŞekerMiktarı = " + yıllıkŞekerMiktarı);

        double yıllıkŞekerMiktarı=(çay*(1.7*2))*365;
        System.out.println("yıllık şeker tüketimiz: "+yıllıkŞekerMiktarı);


    }
}
