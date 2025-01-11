package all.in.one;

public class Long {

    public void alllong()
    {
        long no1=912345000;
        long no2=909070000;
        long add,sub,divide,multiply;

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
        Long s = new Long();
        s.alllong();
    }

}
