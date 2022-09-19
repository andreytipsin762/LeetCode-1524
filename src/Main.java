/*
Given an array of integers arr, return the number of subarrays with an odd sum.
Since the answer can be very large, return it modulo 10^9 + 7
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] subArrayTrim(int[] array, int beg, int end) {
        return Arrays.copyOfRange(array, beg, end+1);
    }
    static int answer = 0;
    public static void main(String[] args) {
        int beg, end;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter array element number " + i + ":");
            arr[i] = scan.nextInt();
        }
//        int[] subArray = new int[0];
        int[] subArray = new int[0];
        for (int i = 0; i < n; i++) {
            int k = 0;

            for (int j = i; j < n; j++) {
                beg = i;
                end = j;
                subArray = subArrayTrim(arr, beg, end);

                int sum = 0;
                for (int m = 0; m < subArray.length; m++) {
                    sum += subArray[m];
                }
                if (sum % 2 != 0) {
                    answer++;
                }

            }
        }
        System.out.println(answer);

    }
}