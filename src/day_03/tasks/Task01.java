package day_03.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Kullanıcıdan ara sınav notu, final notu ve proje notunu girmesini isteyin
Genel notu hesaplayın (ara sınav: %30, proje: %20, final: %50)

Örnek:
GİRDİ: ara sınav notu=78
final notu = 66
proje notu = 90
ÇIKTI: "Notunuz : 81,6"

		 */
        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen vize notunuzu giriniz: ");
        int vizeNotu= scan.nextInt();
        System.out.print("lütfen final notunuzu giriniz: ");
        int finalNotu= scan.nextInt();
        System.out.print("lütfen proje notunuzu giriniz: ");
        int projeNotu= scan.nextInt();

        int genelNot=((30*vizeNotu/100)+(50*finalNotu/100)+(20*projeNotu/100));
        System.out.println("genelNotunuz = " + genelNot);


            if (genelNot>=0&&genelNot<50){
                System.out.println("harf notunuz: F");

            } else if (genelNot>=50&&genelNot<60){
            System.out.println("harf notunuz: D");

            } else if (genelNot>=60&&genelNot<70){
                System.out.println("harf notunuz: C");

            }else if (genelNot>=70&&genelNot<80){
                System.out.println("harf notunuz: B");

            }else if (genelNot>=80&&genelNot<=100){
                System.out.println("harf notunuz: A");

            }
                if (genelNot<60||finalNotu<60||projeNotu<70){
                    System.out.println("'bütünlemeye kaldınız'");
                }else {
                    System.out.println("'tebrikler dersi geçtiniz'");
                }


    }
}
