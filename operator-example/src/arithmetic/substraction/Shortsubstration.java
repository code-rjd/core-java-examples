package arithmetic.substraction;

public class Shortsubstration {
    public void shorts()
    {
        short no1=25;
        short no2=2;
        short sub;
        // for getting answer we need to assign int datatype for sub
        sub = (short) (no1 - no2);
        // otherwise short has to be added while performing substraction
        System.out.println("Answer = " + sub);
    }
    public static void main(String[] args)
    {
        Shortsubstration ss = new Shortsubstration();
        ss.shorts();
    }
}
