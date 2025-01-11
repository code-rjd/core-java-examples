package divide.function;

public class Shortdivide {
    public void shortd()
    {
        float no1= 25f;
        //for accurate answer we need to define float datatype for no1 and divide variable
        short no2=2;
        float divide;
        divide = (no1 / no2);

        System.out.println("Answer = " + divide);
    }
    public static void main(String[] args)
    {
        Shortdivide sd = new Shortdivide();
        sd.shortd();
    }
}
