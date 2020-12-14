package new_features.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("hi");
        list.add("jk");

        List<Character> streamList = list.stream()
                .filter(item -> item.length() == 3)
                .limit(1)
                .map(item -> item.charAt(2))
                .collect(Collectors.toList());
        System.out.println(streamList.toString());
    }
}
