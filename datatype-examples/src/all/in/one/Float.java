package all.in.one;

public class Float {
    public void allfloat()
    {
        float no1=3.14f;
        float no2=4.52f;
        float  add,sub,divide,multiply;

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
        Float s = new Float();
        s.allfloat();
    }

}
