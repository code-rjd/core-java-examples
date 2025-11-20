package thread;

import runnable.DemoRunnableThread;

public class DemoThread extends Thread {
    public void run(){
        System.out.println("Demo thread" + Thread.currentThread().getId()
        + "with " + Thread.currentThread().getName() + "is runnning");
        System.out.println("-------------------------------------------------------------");
    }

}
