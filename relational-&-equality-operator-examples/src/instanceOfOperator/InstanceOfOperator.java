package instanceOfOperator;

public class InstanceOfOperator {
    public static void main(String[] args) {
        String city = "Pune";
        Integer l = 25;
        Double t = 25.5;

        if (city instanceof String){
            System.out.println(" type of city is string");
        } else {
            System.out.println(" not string");
    }
        if ( l instanceof Integer){
            System.out.println(" integer");
        } else {
            System.out.println("not integer");
        }
        if (t instanceof Double) {
            System.out.println("double");
        } else{
            System.out.println("not double");
        }
}}
