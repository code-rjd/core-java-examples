package pattern;

public class AStarPatternFor {
    //pseudo code
    // print below pattern
    //                    *
    //              *     *
    //        *     *     *
    //   *    *    *     *
    //*  *    *    *      *
    public static void main(String[] args) {
//        int s = 5;
//        for (int i = 1;i <= s; i++)
//        {         //rows count
//            for ( int ic = 1; ic <= s - i;ic++)
//            {   //column count
//                System.out.print(" ");
//            }
//            for (int ic = 1; ic <= s  ; ic++) {
//            System.out.print("*\n");
//                    }
//            System.out.println();
//    }
        int N = 5;

        // Outer loop runs N times, once for each row
        for (int i = 1; i <= N; i++) {
            // Inner loop prints 'N - i' spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print("\t");
            }

            // Inner loop prints 'i' stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            // Move to the next line
            System.out.println("\n");
        }
}}