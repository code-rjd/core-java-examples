
public class Train {
    private int trainID;
    private String trainName;

    //default constructor - non-parametrized
    public Train() {
    // the public above is default access specifier, it will work even if not written
    }

    // parametrized constructor
    public Train(int id, String name) {
        this.trainID = id;
        this.trainName = name;
    }

    public int getTrainID() {
        return trainID;
    }

    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainID=" + trainID +
                ", trainName='" + trainName + '\'' +
                '}';
    }
}
