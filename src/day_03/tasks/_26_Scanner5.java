package day_03.tasks;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    Create a code that prints the city where the user lived 10 years ago.   */

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the name of the city you lived in 10 years ago");

         String cityName=scan.nextLine();
        System.out.println("the name of the city you lived in 10 years ago = " + cityName);


    }
}
