public class ObjectDemo {
    public static void main(String[] args) {
        Object object = new  Object();
            object = 1;
//        object = 23423.2456;
//        object = 123456789L;
//        object = 1.2f;
//        object = "this the new beginning";
//        object = true;
//        object = new Student();
          System.out.println("Object:" + object);
    }

    static class Student {
        int roll;
        String name;
    }
}
