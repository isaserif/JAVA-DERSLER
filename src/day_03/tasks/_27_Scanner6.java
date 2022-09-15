package day_03.tasks;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    the user Create the code that prints the birthday */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the day you were born");
        int day=scan.nextInt();

        System.out.println("please enter the month you were born");
        int month=scan.nextInt();

        System.out.println("please enter the year you were born");
        int year=scan.nextInt();

        System.out.println("your birtday: " + day + "/" + month + "/" + year);


    }
}
