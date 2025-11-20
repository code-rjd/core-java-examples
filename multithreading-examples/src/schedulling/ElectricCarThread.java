package schedulling;

class ElectricCarThread extends Thread {
    int electricCount = 0;

    public void run() {
        System.out.println("Thread Electric started");
        while (electricCount <= 3) {
            System.out.println("value: " + ++electricCount + " in thread Electric");
        }
    }
}
