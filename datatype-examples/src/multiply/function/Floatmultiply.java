package multiply.function;

public class Floatmultiply {
    public void floatm()
    {
        float no1=3.14f;
        float no2=4.52f;
        float multiply;
        multiply = no1 * no2;

        System.out.println("multiply = " + multiply);
    }
    public static void main(String[] args)
    {
        Floatmultiply fm = new Floatmultiply();
        fm.floatm();
    }
}
