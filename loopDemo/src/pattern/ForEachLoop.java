package pattern;

import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<Integer> items = List.of(1,2,3,4,5,6,7,8,9,10);
        for (Integer item : items){
            System.out.println("Item" + item);
        }
    }
}
