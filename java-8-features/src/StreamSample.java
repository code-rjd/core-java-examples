import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StreamSample {
    public static void main(String[] args) {

        // collection improvements
        // old-fashioned
        List<String> oldMsgs = new ArrayList<>();
        oldMsgs.add("hi");
        oldMsgs.add("hello");
        oldMsgs.add("how");
        oldMsgs.add("are");
        oldMsgs.add("you");

        // modern
        List<String> blankList = List.of();
        List<String> messages = List.of("hi", "hello", "how", "are", "you");

        //for-each loop old-fashioned
        for(String msg : messages) {
            System.out.println("msg:" + msg);
        }

        //modern
        messages.forEach(System.out::println);

        Set<String> blankSet = Set.of();
        Set<String> testSet = Set.of("hi", "hello", "how", "are", "you");

        Map<Integer, String> blankMap = Map.of();
        Map<Integer, String> dataMap = Map.of(1, "hi", 2, "hello", 3, "how", 4, "are", 5, "you");
        dataMap.forEach((key, value) -> System.out.println("key: " + key + "value: " + value));
    }
}