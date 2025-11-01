import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> integerList = new CopyOnWriteArrayList<>();
        //List<Integer> integerList = List.of(1, 3, 56, 3425, 676878, 765, 334, 5786);
        // we cannot add elements in the array list directly by using iterator in the middle
            // as shown in line no 24-25
            // this is due to concurrent modification exception


        integerList.addAll(List.of(1, 3, 56, 3425, 676878, 765, 334, 5786));

        Iterator<Integer> integerIterator = integerList.iterator();

        while (integerIterator.hasNext()) {
            int element = integerIterator.next();
            System.out.println("Current element: " + element);

            if (element % 2 == 0) {
                integerList.add(element + 10000);
            }
        }

        System.out.println("At the end the array list is: " + integerList);
    }
}
