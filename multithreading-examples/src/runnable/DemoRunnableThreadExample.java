package runnable;

import thread.DemoThread;

public class DemoRunnableThreadExample {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");
        System.out.println("Demo thread is created by implementing runnable interface");
        System.out.println("-------------------------------------------------------");

        int noOfThreads = 10;
        for (int i = 0; i < noOfThreads; i++) {
            Thread thread = new Thread(new DemoRunnableThread());
            thread.start();
        }
    }
}
