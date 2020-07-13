import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {

    //Given a list of strings, write a method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters.
    public static List<String> search(List<String> list) {
        return list.stream().
                filter(i -> i.startsWith("a") && i.length() == 3).
                collect(Collectors.toList());
    }
}
