import java.util.List;

public class SumOnlyNumWithGivenSum {
    private int desiredSum;

    SumOnlyNumWithGivenSum(int desiredSum){
        this.desiredSum = desiredSum;
    }

    //Task - count sum of integers in a list but only using numbers which sum of digits equals a desiredSum.
    //Disclaimer: Numbers like -27 are considered to have sum of 9, while during addition they are consider as -27
    public int countSum(List<Integer> numList){
        int result = 0;
        for(Integer i : numList){
            if(Math.abs(countSumOfNumber(i)) == desiredSum){
                result += i;
            }
        }
        return result;
    }

    private int countSumOfNumber(int num){
        int result = 0;
        if(num >= 0) {
            while (num > 0) {
                result += num % 10;
                num /= 10;
            }
        } else {
            while (num < 0) {
                result += num % 10;
                num /= 10;
            }
        }
        return result;
    }

    //Second method for counting sum of digits in a number - just for funsies
    private int countSumOfNumberV2(int num){
        int result = 0;
        String[] StringValue = String.valueOf(num).split("");
        if(num >= 0){
            for(String s : StringValue){
                result += Integer.parseInt(s);
            }
        } else {
            for(int i = 1; i < StringValue.length; i++){
                result += Integer.parseInt(StringValue[i]);
            }
        }
        return result;
    }
}
