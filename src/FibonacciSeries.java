import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

    //Task - count Fibonacci's series up to given number
    public static List<Integer> countFibonacciIteratively(int maxValue){
        List<Integer> series = new ArrayList<>();
        int f1 = 0,
            f2 = 1,
            f3 = f1 + f2;
        series.add(f1);
        series.add(f2);
        while(f3 <= maxValue){
            series.add(f3);
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
        return series;
    }

    //Second method for counting the series - just for funsies - note that it's a waaay slower version
    public static List<Integer> countFibonacciRecursively(int maxValue){
        List<Integer> series = new ArrayList<>();
        int n = 1,
            f = recursiveCount(n);
        series.add(0);
        while(f <= maxValue){
            series.add(f);
            n++;
            f = recursiveCount(n);
        }
        return series;
    }

    private static int recursiveCount(int n){
        if(n <= 2) {
            return 1;
        }
        return recursiveCount(n -1 ) + recursiveCount(n - 2);
    }

}
