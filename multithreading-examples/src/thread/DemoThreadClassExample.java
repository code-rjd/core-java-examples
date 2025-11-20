package thread;

public class DemoThreadClassExample {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");
        System.out.println("Demo thread is created by extending thread class");
        System.out.println("-------------------------------------------------------");

        int noOfThreads = 5;
        for (int i = 0; i < noOfThreads; i++) {
            DemoThread demoThread = new DemoThread();
            demoThread.start();
        }
    }
}