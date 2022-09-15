package freework;
public class OCASorusu_01 {
    public static void main(String[] args) {
        int iVar=100;
        float fVar=100.100f;
        double dVar=123;
        fVar=iVar;
     //   iVar=fVar; //int  <float
        iVar= (int) fVar; //casting
     //   fVar=dVar; //float < double
        fVar= (float) dVar;  //casting
        dVar=fVar;
     //   iVar=dVar; //int < double
        iVar= (int) dVar;  //casting
        dVar=iVar;
        //büyük data type leri kendisinden küçük data tiplerine atanamaz.
        //ama casting yaparak atama yapabiliriz
    }
}
