public class FindPrimeNumber {

    //Task - check if given number is Prime
    public static String checkIfPrime(int number){
        if(number <= 1){
            return number + " is neither prime nor composite";
        }
        if(number == 2 || number == 3){
            return number + " is prime";
        } else if(number%2 == 0){
            return number + " is composite since it's dividable by 2";
        }
        int sqrRoot = (int) Math.ceil(Math.sqrt(number));
        for(int i = 3; i <= sqrRoot; i+=2){
            if(number%i == 0){
                return number + " is composite since it's dividable by " + i;
            }
        }
        return number + " is prime";
    }

}
