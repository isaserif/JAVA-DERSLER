package day_03.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyo
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen günde kaç saat uyuduğunuzu girin: ");
        int uykusaati=scan.nextInt();

        System.out.println("aylık uyku saatiniz: "+uykusaati*30+" saat --->>>  "+(uykusaati*30)/24+" gün");
        System.out.println("yıllık uyku saatiniz: "+uykusaati*365+" saat --->>>  "+(uykusaati*365)/24+" gün");
        System.out.println("40 yıllık uyku saatiniz: "+uykusaati*365*40+" saat --->>>  "+(uykusaati*40*365)/24+" gün");
                //output
       // lütfen günde kaç saat uyuduğunuzu girin: 8
      //  aylık uyku saatiniz: 240 saat --->>>  10 gün
     //   yıllık uyku saatiniz: 2920 saat --->>>  121 gün
     //   40 yıllık uyku saatiniz: 116800 saat --->>>  4866 gün









    }
}
