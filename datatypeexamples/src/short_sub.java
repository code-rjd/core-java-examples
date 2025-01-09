public class short_sub {
    public static void main(String[] args)
    {
        short no1=25;
        short no2=2;
        short sub;
        // for getting answer we need to assign int datatype for sub
        sub = (short) (no1 - no2);
        // otherwise short has to be added while performing substraction
        System.out.println("Answer = " + sub);
    }
}
