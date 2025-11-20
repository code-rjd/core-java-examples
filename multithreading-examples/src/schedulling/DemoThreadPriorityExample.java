package schedulling;

public class DemoThreadPriorityExample {
    public static void main(String[] args) {
        System.out.println("=============================Main Thread Starts here================================");
        SportsCarThread sportsCarThread = new SportsCarThread();
        PassangerCarThread passangerCarThread = new PassangerCarThread();
        ElectricCarThread electricCarThread = new ElectricCarThread();

        Thread currentThread = Thread.currentThread();
        System.out.println("Thread name: " + currentThread.getName());
        sportsCarThread.setPriority(Thread.MAX_PRIORITY);
        passangerCarThread.setPriority(Thread.MIN_PRIORITY);
        electricCarThread.setPriority(Thread.NORM_PRIORITY);

        passangerCarThread.start(); // WE CAN PUT HERE VALUE RANGING FROM 0-10 SO THAT ACCORDING TO THE VALUE THE PRIORITY WILL BE SET
        electricCarThread.start();
        sportsCarThread.start();
        System.out.println("=============================Main Thread ends here================================");
    }
}

