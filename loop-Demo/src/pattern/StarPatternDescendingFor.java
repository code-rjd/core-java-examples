package pattern;

public class StarPatternDescendingFor {
    //pseudo code
    // print below pattern
    //*****
    //****
    //***
    //**
    //*
    public static void main(String[] args) {

        for (int i = 5;i > 0; i--)
        {         //rows count
            for (int ic = 0;ic < i;ic++)
            {   //column count
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
}