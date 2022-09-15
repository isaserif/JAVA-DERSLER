package day_03.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen mesafeyi giriniz: ");
        int mesafe=scan.nextInt();
        System.out.print("lütfen hızı giriniz: ");
        int hız=scan.nextInt();

        int süre=  mesafe/hız;
        System.out.println("süre = " + süre+" saattir");


    }
}
