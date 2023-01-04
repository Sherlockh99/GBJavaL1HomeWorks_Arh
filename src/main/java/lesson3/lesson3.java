package lesson3;

import java.util.Arrays;

/**
 * 1. Specify an integer array consisting of elements 0 and 1.
 * Replace 0 with 1 and 1 with 0 in array (see array01)
 *
 * 2. Specify an empty integer array of length 100.
 * Use for to fill it with the values 1 2 3 4 5 6 7 8 … 100; (see array1_100)
 *
 * 3. Set an array [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] loop through it,
 * and multiply numbers less than 6 by 2; (see array1_2)
 *
 * 4. Create a square two-dimensional integer array (the number of rows and columns is the same),
 * and use a loop to fill its diagonal elements with ones. (see diagonal)
 *
 * 5. Write a method that takes two arguments as input: len and initialValue,
 * and returns a one-dimensional array of type int of length len,
 * each cell of which is equal to initialValue; (see printArray)
 *
 * 6. * Set a one-dimensional array and find the minimum and maximum elements in it; (see minMax)
 *
 * 7. ** Write a method to which a non-empty one-dimensional integer array is passed,
 * the method must return true if there is a place in the array
 * where the sum of the left and right parts of the array are equal. (see checkBalance)
 *
 * 8. *** Write a method that receives a one-dimensional array and the number n
 * (can be positive or negative) as input,
 * while the method must shift all elements of the array by n positions.
 * Elements move cyclically. (see arrayOffset)
 *
 * P.S. Some method names are not implemented in CamelCase style for ease of understanding. (see arrayOffset)
 */

public class lesson3 {

    public static void main(String[] args) {

        System.out.println("Task 1");
        array01();

        System.out.println("Task 2");
        array1_100();

        System.out.println("Task 3");
        array1_2();

        System.out.println("Task 4");
        int arr[][] = new int[5][5];
        diagonal(arr);

        System.out.println("Task 5");
        int arr2[] = initArray(5,8);
        printArray(arr2);

        System.out.println("Task 6");
        minMax();

        System.out.println("Task 7");
        int arr3[] = {2, 2, 2, 1, 2, 2, 10, 1};
        boolean result = checkBalance(arr3);
        System.out.println(result);

        int arr4[] = {1, 1, 1, 2, 1};
        result = checkBalance(arr4);
        System.out.println(result);

        int arr5[] = {1, 1, 1, 8, 1};
        result = checkBalance(arr5);
        System.out.println(result);

        System.out.println("Task 8");
        int arr6[] = {1, 2, 3, 4, 5};
        arrayOffset(arr6,3);
        printArray(arr6);

        int arr7[] = {1, 2, 3, 4, 5};
        arrayOffset(arr7,-3);
        printArray(arr7);
    }

    public static void array01(){
        int arr01[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr01.length; i++) {
            if (arr01[i] == 0) {
                arr01[i] = 1;
            } else {
                arr01[i] = 0;
            }
        }
        printArray(arr01);
    }

    public static void array1_100(){
        int arr[] = new int[100];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = i + 1;
        }
        printArray(arr);
    }

    public static void array1_2() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<6){
                arr[i] = arr[i] * 2;
            }
        }
        printArray(arr);
    }

    public static void diagonal(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length-i-1]=1;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            printArray(arr[i]);
        }
    }

    public static int[] initArray(int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < len ; i++) {
            arr[i]=initialValue;
        }
        return arr;
    }

    public static void minMax(){
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] temp = arr.clone();
        Arrays.sort(temp);
        System.out.println("Min value: " + temp[0] + "; Max value: " + temp[temp.length-1]);
        temp = null;
    }

    public static boolean checkBalance(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        int sum_begin = arr[0];
        int sum_end = arr[arr.length-1];
        boolean result = false;
        while (true){
            if(sum_begin == sum_end && (i==j-1)){
                result = true;
                break;
            }

            if(sum_begin>sum_end){
                j = j - 1;
            }else{
                i = i + 1;
            }
            if(i>=j){
                break;
            }
            if(sum_begin>sum_end) {
                sum_end = sum_end + arr[j];
            }else {
                sum_begin = sum_begin + arr[i];
            }
        }

        return result;
    }

    public static void arrayOffset(int[] arr, int n){
        int temp;
        for (int i = 0; i < Math.abs(n); i++) {
            if(n>=0) {
                temp = arr[arr.length - 1];
                for (int j = arr.length-1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = temp;
            }else{
                temp = arr[0];
                for (int j = 0; j <arr.length-1; j++) {
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=temp;
            }
        }
    }
}
