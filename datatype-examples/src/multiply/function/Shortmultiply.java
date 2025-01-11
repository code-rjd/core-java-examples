package multiply.function;

public class Shortmultiply {
    public void shortm()
    {
        short no1=25;
        short no2=2;
        short multiply;
        multiply = (short) (no1 * no2);
        // otherwise short has to be added while performing multiplication
        System.out.println("Answer = " + multiply);
    }
    public static void main(String[] args)
    {
        Shortmultiply sm = new Shortmultiply();
                sm.shortm();
    }
}
