package addition.function;

public class Floatadd {
    public void floatno()
    {
        float no1=3.14f;
        float no2=4.52f;
        float sum;
        sum = no1 + no2;

        System.out.println("sum = " + sum);
    }
    public static void main(String[] args)
    {
        Floatadd f = new Floatadd();
        f.floatno();
    }
}
