package pattern;

public class StarPatternAscendingFor {
    //pseudo code
    // print below pattern
    //*
    //**
    //***
    //****
    //*****
    public static void main(String[] args) {

        for (int i = 0;i < 5; i++)
        {         //rows count
            for (int ic = 0;ic <= i;ic++)
            {   //column count
                System.out.print("*\t");

            }            System.out.println("\n");

        }
    }
}