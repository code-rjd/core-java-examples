package arithmetic.divide;

public class Longdivide {
    public void longd()
    {
        double no1=912345000;
        //for accurate answer we need to define double data type for no1 and for divide variable
        long no2=909070000;
        double divide;
        divide = no1 / no2;

        System.out.println("Answer = " + divide);
    }
    public static void main(String[] args)
    {
        Longdivide ld = new Longdivide();
        ld.longd();
    }
}
