package multiply.function;

public class Longmultiply {
    public void longm()
    {
        long no1=912345000;
        long no2=909070000;
        long multiply;
        multiply = no1 * no2;

        System.out.println("Answer = " + multiply);
    }
    public static void main(String[] args)
    {
        Longmultiply lm = new Longmultiply();
        lm.longm();
    }
}
