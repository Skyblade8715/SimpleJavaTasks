public class ArmstrongNumber {
    //A number is called an Armstrong number if it is equal to the cube of its every digit.
    // For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3.
    // You need to write a program to check if the given number is Armstrong number or not
    public static String isArmstrongNumber(int num){
        int posNum = Math.abs(num),
                digit,
                cubicSum = 0;
        int expectedRes = posNum;
        while(posNum > 0){
            digit = posNum % 10;
            cubicSum += Math.pow(digit, 3);
            posNum /= 10;
        }
        if(cubicSum == expectedRes){
            return num + " is an Armstrong number";
        } else {
            return num + " is not an Armstrong number";
        }
    }
}
