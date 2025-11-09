package arithmetic.all;

public class Double {
    public void alldouble()
    {
        double no1=2.144556;
        double no2=3.524215;
        double  add,sub,divide,multiply;

        add =  (no1 + no2);
        sub = ( no1 - no2);
        multiply = ( no1 * no2);
        divide =  (no1 / no2);


        System.out.println("Answer add = " + add);
        System.out.println("Answer sub = " + sub);
        System.out.println("Answer multiply = " + multiply);
        System.out.println("Answer divide = " + divide);
    }
    public static void main(String[] args) {
        Double s = new Double();
        s.alldouble();
    }

}
