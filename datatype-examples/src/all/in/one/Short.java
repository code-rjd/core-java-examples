package all.in.one;

public class Short {

    public void allshort()
    {
        short no1=5;
        short no2=2;
        short add,sub,divide,multiply;

        add = (short) (no1 + no2);
        sub = (short) ( no1 - no2);
        multiply = (short) ( no1 * no2);
        divide = (short) (no1 / no2);


        System.out.println("Answer add = " + add);
        System.out.println("Answer sub = " + sub);
        System.out.println("Answer multiply = " + multiply);
        System.out.println("Answer divide = " + divide);
    }
    public static void main(String[] args) {
        Short s = new Short();
        s.allshort();
    }
}
