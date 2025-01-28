public class SequenceDemo {
    public static void main(String[] args) {

        //pseudo code
        //initialize no=0
        //increment no
        //write statement to print number
        // add above code to loop

        int no = 0;
        //check condition
        System.out.println("output using while loop");
        while (no <= 10){
            //code snippet
            System.out.println("no = "+ no);
            no++;
        }
        //do_while
        System.out.println("output using do while loop");
        do {
            //code snippet
            System.out.println("no = "+ no);
            no++;
        } while (no <= 10);
    }
}