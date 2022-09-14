package day_02;

public class C02_Concatenation {
    public static void main(String[] args) {

        String ad="isa";
        String soyad="şerif";
        int a =7;
        int b=11;

        // Birden çok string variable ile farklı data type variable ler + ile işleme alınırsa
        //java birleştirme yaparak yeni bir String oluşturur.

        //TRİCK:) Bir aritmetik işlem içinde String kullanılırsa aritmetik işlen
        //önceliğine göre işlem yapılım String variable a concatenation yapılır.
        System.out.println(ad+soyad+a+b);//isaşerif711
        System.out.println(a+ad+soyad+b);//7isaşerif11
        System.out.println(a+b+ad+soyad);//18isaşerif string e kadar işlem ne ise onu yapar.
        System.out.println(" "+a+b);     //...711
        System.out.println(ad+soyad+(a+b));//isaşerif18 parentez içlerini toplar sonra stringle birleştirir.
        System.out.println((a+b)+ad+soyad);//18isaşerif
        System.out.println(ad+(a-b)+(a-b));//isa-4-4
        System.out.println("****************************");
        char ch='1';
        System.out.println(ad+ch);// ch in asci değeri 1 olduğu için
        //concatenation olarak asci değerini yapar.
        System.out.println(a+ch+ad);//56isa // 1 in asci değeri 49 dur, 7+49isa
        System.out.println(ad+(ch+b));//isa60
        System.out.println(a+ad+ch); //7isa1
        //char data types işleme gir diği variable in türüne göre farklı işlem yapa
        //eğer işleme girdiği variables aritmetik bir işlem ise asci değeri ile işlem yapar






    }
}
