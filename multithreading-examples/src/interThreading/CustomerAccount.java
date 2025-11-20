package interThreading;

public class CustomerAccount {
    int balance = 10000;
    boolean withdrawalInProgress = false;

    synchronized void withdraw(int amount) {
        withdrawalInProgress = true;
        System.out.println("going to withdraw...");

        if (this.balance < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        this.balance -= amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...");
        this.balance += amount;
        System.out.println("deposit completed... ");
        notify();
    }

//    synchronized void balanceCheck(){
//        if (withdrawalInProgress){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Balance is : " + this.balance);
//        notify();
//    }
}