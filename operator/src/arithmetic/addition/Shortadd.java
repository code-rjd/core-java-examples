package arithmetic.addition;

public class Shortadd {

    public void subs()
    {
        short no1=5;
        short no2=2;
        short sum;
        // for getting answer we need to assign int datatype for sum
        sum = (short) (no1 + no2);
        // otherwise short has to be added while performing addition
        System.out.println("Answer = " + sum);
    }
    public static void main(String[] args) {
        Shortadd s = new Shortadd();
        s.subs();
    }
}
