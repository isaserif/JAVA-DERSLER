package day_02;

public class C01_DataTyeps {
    public static void main(String[] args) {
        //TASK-->> 1999 yılında doğan bir kişinin yaşını yazınız.
        int doğumYılı=1999,şimdikiYıl=2022,yaş;

        yaş=şimdikiYıl-doğumYılı;
        System.out.println("yaşınız:  "+yaş);//yaşınız:  23

        //Tesk-->> iki farklı byte tanımlayıp toplam farkını tanımlayınız.
        byte x=34,y=12;
        byte sonuç = (byte) (x - y);//casting
        System.out.println(sonuç);

        //Tesk-> iki farklı tam sayı türünden sayı tanımlayıp toplam farkını prpnt ediniz.
        int t=136;
        byte d=23;
        System.out.println(t-d);
        //Tesk -> tamsayı ve ondalıklı sayı tanımlayıp toplamını print ediniz

        int n=33;
        double m=14.33;
        System.out.println(n+m);

        //Tesk->> bir int ve char değişken tipindeki değerleri toplayınız.
         int sayi=63;
         char para='$';
        System.out.println(sayi+para);
      //not: Aski değerlerini topladığı için iki tip toplanır.

// Task Ad ve soyadınızı ve yaşınızı yazınız
        String ad="isa",soyad="şerif";
        int age=34;
        System.out.println(ad+soyad+age);







    }
}
