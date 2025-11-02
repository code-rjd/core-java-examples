public class ObjectDemo2 {
        public static void main(String[] args) {
            Object objectDoubleValue = 23424.3453;
            //object = new Student();
            // auto-boxing
            double doubleValue = (double)objectDoubleValue;
            Double secondDoubleValue = 233424.34;
            // Double is a utility class
            // we can use secondDoubleValue. and can different functions

            // unboxing
            System.out.println("Object: " + doubleValue);
        }

        static class Student {
            int roll;
            String name;
        }
    }

