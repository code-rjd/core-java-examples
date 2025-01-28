package pattern;

public class StarPatternAscendingDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {         //rows count
            int ic = 0;
            do{   //column count
                System.out.print("*\t");
                ic++;
            }while (ic <= i);
            System.out.println("\n");
            i++;
        } while (i < 5);
    }

}
