package day01.J02_DataTypes_WrapperClass;

public class C01_VariableCreate {
    public static void main(String[] args) {
        // 1.yol >>>> best pratice(recomend) tavsiye edilen
        int salary=33000;
        int age=34;
        System.out.println(age);
        System.out.println(salary);

        // 2.yol >>> tavsiye edilmez
        int boy;
        boy=61;
        System.out.println("your height: "+boy);
        //3. yol >>>
        int yevmiye,yaş,kilo;
        yevmiye=150;
        yaş=34;
        kilo=80;
        System.out.println(yevmiye);
        System.out.println(yaş);
        System.out.println(kilo);
        System.out.println(yaş+"  "+yevmiye+"  "+kilo);

    }
}
