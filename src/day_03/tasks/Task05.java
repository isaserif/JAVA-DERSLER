package day_03.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		Scanner scan=new Scanner(System.in);
		System.out.print("lütfen x değerini giriniz: ");
		int x =scan.nextInt();
		System.out.print("lütfen y değerini giriniz: ");
		int y =scan.nextInt();

		System.out.println("toplam: "+ (x+y));
		System.out.println("çıkarma: "+ (double)(x-y));
		System.out.println("çarpma: "+ (x*y));
		System.out.println("bölme: "+ (double)(x/y));







	}

}
