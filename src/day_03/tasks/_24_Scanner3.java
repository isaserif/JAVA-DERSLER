package day_03.tasks;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the name of your favorite fruit ");
        String fruitName=scan.nextLine();
        System.out.print("the name of your favorite fruit: = " + fruitName);


    }
}
