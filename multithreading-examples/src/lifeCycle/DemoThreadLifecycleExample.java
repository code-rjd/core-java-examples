package lifeCycle;

class Motorcycle implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println("State of motorcycle while it called join() method on another thread : " + DemoThreadLifecycleExample.secondaryDemoThreadLifecycleExample.getState());
    }
}

public class DemoThreadLifecycleExample implements Runnable {

    static DemoThreadLifecycleExample demoThreadLifecycleExample = new DemoThreadLifecycleExample();
    static Thread secondaryDemoThreadLifecycleExample = null;

    public static void main(String[] args) {
        secondaryDemoThreadLifecycleExample = new Thread(demoThreadLifecycleExample);
        System.out.println("State of demoThreadLifecycleExample thread after creating it : " + secondaryDemoThreadLifecycleExample.getState());

        secondaryDemoThreadLifecycleExample.start();
        System.out.println("State of demoThreadLifecycleExample thread after starting : " + secondaryDemoThreadLifecycleExample.getState());
    }

    @Override
    public void run() {
        Motorcycle motorcycle = new Motorcycle();
        Thread secondaryMotorcycleThread = new Thread(motorcycle);

        System.out.println("State of secondary mototrcycle thread after creating it : " + secondaryMotorcycleThread.getState());
        secondaryMotorcycleThread.start();
        System.out.println("State of secondary mototrcycle thread after .start() method : " + secondaryMotorcycleThread.getState());

        try {
            Thread.sleep(250);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println("State of motorcycle while it called .sleep() method call : " + secondaryMotorcycleThread.getState());


        try {
            secondaryMotorcycleThread.join();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println("State of motorcycle while it called join() method call : " + secondaryMotorcycleThread.getState());
    }
}