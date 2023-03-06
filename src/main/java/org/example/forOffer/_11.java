package org.example.forOffer;

/**
 * Created by hekun on 2023/1/15 09:36
 */
public class _11 {
    public static int minArray(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i - 1] > numbers[i]) {
                return numbers[i];
            }
        }
        return numbers[0];
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,1};
        System.out.println(minArray(arr));
    }
}
