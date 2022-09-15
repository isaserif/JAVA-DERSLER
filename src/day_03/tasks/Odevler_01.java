package day_03.tasks;

public class Odevler_01 {
    public static void main(String[] args) {
          /*  TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan
​
	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20
         */
        System.out.println("1.yöntem");
        int sayi1=20,sayi2=34,temp;
        System.out.println("swap tan önce: "+sayi1);
        System.out.println("swap tan önce: "+sayi2);

        temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("swap tan sonra: "+sayi1);
        System.out.println("swap tan sonra: "+sayi2);

        System.out.println("2.yöntem");
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("swap tan sonra: "+sayi1);
        System.out.println("swap tan sonra: "+sayi2);



    }
}
