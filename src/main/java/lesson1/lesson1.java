package lesson1;

public class lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 10;
        int b = 5;
        int sum = a + b;
        if(sum>=0){
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public static void printColor(){
        int value = 999;
        if(value<=0){
            System.out.println("RED");
        }else if(value<=100){
            System.out.println("ORANGE");
        }else {
            System.out.println("GREEN");
        }
    }

    public static void compareNumbers(){
        int a = 10;
        int b = 5;
        if(a>=b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
    }
}
