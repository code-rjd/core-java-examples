package otherOperations;

public class ThreadYieldMethodDemo extends Thread {

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " running ");
            }
        }
        public static void main(String[] args) {
            ThreadYieldMethodDemo t1 = new ThreadYieldMethodDemo();
            ThreadYieldMethodDemo t2 = new ThreadYieldMethodDemo();
            t1.start();
            t2.start();
            for(int i=0 ; i < 5; i++){
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + " running ");
            }
        }
    }