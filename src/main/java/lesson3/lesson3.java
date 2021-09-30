package lesson3;

import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
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

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
