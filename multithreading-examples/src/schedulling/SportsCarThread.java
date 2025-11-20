package schedulling;

class SportsCarThread extends Thread {
    int sportsCount = 0;

    public void run() {
        System.out.println("Thread sportsCar started");
        while (sportsCount <= 3) {
            System.out.println("value: " + ++sportsCount + " in thread sportsCar");
        }
    }
}
