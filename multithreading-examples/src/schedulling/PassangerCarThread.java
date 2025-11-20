package schedulling;

class PassangerCarThread extends Thread {
    int passangerCount = 0;

    public void run() {
        System.out.println("Thread Passanger started");
        while (passangerCount <= 3) {
            System.out.println("value: " + ++passangerCount + " in thread Passanger");
        }
    }
}
