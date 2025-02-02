public class ArrayDemo {
    public static void main(String[] args) {
        int marks[] = new int[5];
        marks[0] = 45;
        marks[1] = 57;
        marks[2] = 98;
        marks[3] = 38;
        marks[4] = 76;

        System.out.println("\nSize of Array:" + marks.length);

        //while loop

        int position = 0;
        System.out.println("\ndemo of while loop");
        while(position < marks.length){
            System.out.println(marks[position]);
        position++;
        }
        System.out.println("-------------------");

        //for loop

        System.out.println("\ndemo of for loop");
        for (int index=0; index<marks.length; index++){
            System.out.println(marks[index]);
        }
        System.out.println("----------------");


        //for-each loop

        System.out.println("\n demo of for each loop");
        for(int element:marks){
            System.out.println(element);
        }
    }
}
