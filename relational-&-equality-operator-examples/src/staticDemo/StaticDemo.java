package staticDemo;

public class StaticDemo {
    int no;
    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
                                 // . denotes location
                                // sd declared that it is from StaticDemo Class
                                // StaticDemo is class but sd is object defined for class StaticDemo.
        sd.no = 10;
        sd.printNo();
    }
  public void printNo(){
              System.out.println(" no value =" + no);
  }
  }