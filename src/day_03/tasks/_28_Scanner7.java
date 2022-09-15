package day_03.tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Create a boolean.
               Type "Do You Have a Bank Account?" in the console.
               If yes, answer as True, otherwise as False.
               Print the boolean.   */

        Scanner scan =new Scanner(System.in);
        System.out.println("Do You Have a Bank Account?");
        boolean answer= scan.nextBoolean();
        if (answer=true){
            System.out.println("yes");
        }else if (answer=false){
            System.out.println("no");
        }
        }








    }

