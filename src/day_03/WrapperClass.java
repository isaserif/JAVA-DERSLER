package day_03;

import java.util.Locale;

public class WrapperClass {
    public static void main(String[] args) {

        String name ="İSA";
        int yas=33;

        System.out.println(name.toLowerCase());//tüm harfleri küçük harf yapar
        System.out.println(name.toUpperCase());

            /*
            -non-primitive data turleri data depolamak yanında kullanışlı bir çok medgodlara sahiptir.
            -ancak primitive data turlerinin böyle bir özelliği yoktur.
            -primitive data turleri sadece değerleri saklar(conrainer) ve herhangi bir özellik(medhod) vs bulundurmaz.
            -Anack primitive data türleri için de bazı işlemler için (String den tamsayı çekme) medhodlara ihtiyaç
            olduğundan java her bir primitive data turunu, non-primitive Wrapper Class oluşturarak ilgili medhodlar
            ara çöüm imkanı sunar.

             */
        String Tc="123456";
        String Id="8474738";
        System.out.println("tc+Id = " + Tc + Id);  //1234568474738  iki string toplanmaz ama "concat" birleştirme yapılabir.


        int newTc=  Integer.valueOf(Tc);     // tc String değerini int çevirdi ve newTc 'ye atadı.
        int newId=  Integer.valueOf(Id);    //Id String değerini int e çevirdi ve newId ' ye çevirdi.

        System.out.println(newTc + newId);  //aritmatik toplama--->8598194

        String okulNo="35483874";
        System.out.println("okulNo = " + okulNo);
        int newOkulNo= Integer.valueOf(okulNo);
        System.out.println("newOkulNo = " + newOkulNo);


        //TASK-> byte short ve int maximum ve minumum değerlerini yazdıran kod yazınız.

        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);

        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);

    }
}
