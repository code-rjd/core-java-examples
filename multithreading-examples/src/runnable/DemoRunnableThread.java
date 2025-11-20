package runnable;

public class DemoRunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Demo thread" + Thread.currentThread().getId()
                + "with " + Thread.currentThread().getName() + "is runnning");
        System.out.println("-------------------------------------------------------------");
    }
}