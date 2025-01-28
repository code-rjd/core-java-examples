package pattern;

public class StarPatternAscendingWhile {
    //pseudo code
    // print below pattern
    //*
    //**
    //***
    //****
    //*****
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {         //rows count
            int ic = 0;
            while (ic <= i) {   //column count
                System.out.print("*\t");
                ic++;
            }
            System.out.println("\n");
            i++;
        }
    }
}