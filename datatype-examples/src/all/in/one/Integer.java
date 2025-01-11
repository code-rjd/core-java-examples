package all.in.one;

public class Integer {
    public void allint()
    {
        int no1=10;
        int no2=20;
        int add,sub,divide,multiply;

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
        Integer s = new Integer();
        s.allint();
    }

}

