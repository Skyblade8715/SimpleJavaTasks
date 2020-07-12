import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String sentence = "Sentence that tests reversing words inside of the sentence without changing their order";
        System.out.println(sentence);
        System.out.println(ReverseWordsInSentence.reverse(sentence));
        SumOnlyNumWithGivenSum summator = new SumOnlyNumWithGivenSum(9);
        List<Integer> testingIntegerList = new ArrayList<>(Arrays.asList(27, 31, 32, 9, 23, 111111, 63, -9)); //For 9 as desiredSum expected result is 27+9+63-9 which is 90.
        System.out.println(summator.countSum(testingIntegerList));

        System.out.println(FibonacciSeries.countFibonacciIteratively(133));
        System.out.println(FibonacciSeries.countFibonacciRecursively(133));
        System.out.println(FindPrimeNumber.checkIfPrime(49));
        System.out.println(FindPrimeNumber.checkIfPrime(7919));
    }
}

