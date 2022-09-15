package day_03.tasks;

import java.util.Scanner;

public class Task10 {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {


// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

    // c = (f-32)*5/9

        System.out.println("lütfen sıcaklığı giriniz: ");

        double f=scan.nextDouble();
         double c=(f-32)*5/9;
        System.out.println(Math.round(c));





}}
