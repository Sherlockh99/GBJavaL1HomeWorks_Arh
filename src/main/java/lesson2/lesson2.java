package lesson2;

/**
 * 1. Write a method that takes two numbers (between10_20).
 * If their sum is between 10 and 20 (inclusive) return true otherwise return false
 * (see between10_20)
 *
 * 2. Write a method that takes an integer as a parameter. The method should print to
 * the console whether the number passed is positive or negative.
 * Note: zero is considered a positive number. (see positiveOrNegative)
 *
 * 3. Write a method that takes an integer as a parameter. The method should return
 * true if the number is negative and return false if positive. (see positive)
 *
 * 4.Write a method that takes two arguments: string and number
 * the method should print the specified string to the console
 * as many times as specified in the second argument (see repeat)
 *
 * 5. * Write a method that determines if the year is a leap year.
 * If the year is a leap year, return true otherwise return false
 *
 * P.S. Method names are not implemented in CamelCase style for ease of understanding.
 */
public class lesson2 {
    public static void main(String[] args) {
        System.out.println(between10_20(5,8));
        positiveOrNegative(5);
        System.out.println(positive(5));
        repeat("Repeat",5);
        leapYear(2100);
    }

    public static boolean between10_20(int a, int b){
        if(a+b>=10&&a+b<=20){
            return true;
        }else{
            return false;
        }
    }

    public static void positiveOrNegative(int a){
        if(positive(a)){
            System.out.println("Passed a positive number");
        }else{
            System.out.println("Passed a negative number");
        }
    }

    public static boolean positive(int a){
        return a>=0;
    }

    public static void repeat(String s, int r){
        for(int i=0;i<r;i++){
            System.out.println(s);
        }
    }

    public static void leapYear(int year){
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
            System.out.println(year +" - leap year.");
        }
        else
        {
            System.out.println(year + " - not a leap year.");
        }
    }
}
