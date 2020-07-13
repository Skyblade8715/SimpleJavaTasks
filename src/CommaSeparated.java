import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparated {
    //Write a method that returns a comma-separated string based on a given list of integers.
    //Each element should be preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd.
    // For example, if the input list is (3,44), the output should be 'o3,e44'.
    public static String getString(List<Integer> list) {
        return list.stream().map(i -> {
            if (i % 2 == 0) {
                return "e" + i;
            } else {
                return "o" + i;
            }
        }).collect(Collectors.joining(", ")); //I added space just to make it look nicer. Comma with no space looks tilting :)
    }
}
