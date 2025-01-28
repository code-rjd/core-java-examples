package finalDemo;

public class FinalDemo {

    public final String GREETING_MSG = " Hello Pune...!!!";
    public final int DEFAULT_LOAD= 10;
    public final double DEFAULT_TEMP = 35.5;
    public final char DEFAULT_CHAR = 'a';
    public final boolean DEFAULT_FLAG = false;
    public static final String GREETING_MSG_TO_WORLD = "Hello World ...!!!";

    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();

        System.out.println(" msg : " + fd.GREETING_MSG);
        System.out.println(" msg : " + GREETING_MSG_TO_WORLD);

        fd.printmsg();
            }
        public void printmsg(){
            System.out.println("1." + DEFAULT_CHAR);
            System.out.println("2." + DEFAULT_FLAG);
            System.out.println("3." + DEFAULT_LOAD);
            System.out.println("4." + DEFAULT_TEMP);

        }
}
