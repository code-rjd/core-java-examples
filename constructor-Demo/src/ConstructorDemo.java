

public class ConstructorDemo {
    public static void main(String[] args) {
        Train train1 = new Train();
        train1.setTrainID(1);
        train1.setTrainName("Shatapbdi Express");

        Train train2 = new Train(2,"Rajdhani express");
        //train2.setTrainID(2);
        //train2.setTrainName("Rajdhani Express");

        System.out.println("Train1: " + train1);
        System.out.println("Train2: " + train2);

    }
}
