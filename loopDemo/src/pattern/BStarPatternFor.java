package pattern;

public class BStarPatternFor {
    //pseudo code
    // print below pattern
    //                    *
    //              *     *
    //        *     *     *
    //   *    *    *     *
    //*  *    *    *      *
    public static void main(String[] args) {

        int N = 5;

        // Outer loop runs N times, once for each row
        for (int i = 1; i <= N; i++) {
            // Inner loop prints 'N - i' spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("\t");
            }

            // Inner loop prints 'i' stars
            for (int j = 1; j <= N-i+1; j++) {
                System.out.print("*\t");
            }
            // Move to the next line
            System.out.println("\n");
        }
}}