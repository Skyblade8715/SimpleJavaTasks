import java.util.List;

public class SumOnlyNumWithGivenSum {
    private int desiredSum;

    SumOnlyNumWithGivenSum(int desiredSum){
        this.desiredSum = desiredSum;
    }

    //Task - count sum of integers in a list but only using numbers which sum of digits equals a desiredSum.
    public int countSum(List<Integer> numList){
        int result = 0;
        for(Integer i : numList){
            if(countSumOfNumber(i) == desiredSum){
                result += i;
            }
        }
        return result;
    }

    private int countSumOfNumber(int num){
        int result = 0;
        while (num > 0){
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}
