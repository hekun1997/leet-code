package org.example.forOffer;

/**
 * Created by hekun on 2023/1/31 09:19
 */
public class _15 {
    public static int hammingWeight(int n) {
        long number;
        if (n < 0) {
            number = Integer.toUnsignedLong(n);
        } else {
            number = n;
        }
        long dividend = 2;
        long quotient;
        long remainder;
        StringBuilder result = new StringBuilder();
        do {
            quotient = number / dividend;
            remainder = number % dividend;
            number = quotient;
            result.append(remainder);
        } while (quotient > 0);

        result.reverse();

        int oneCount = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '1') {
                oneCount ++;
            }
        }
        return oneCount;
    }

    public static int hammingWeight2(int n) {
        int oneCount = 0;
        while (n != 0) {
            oneCount += n & 1;
            n >>>= 1;
        }
        return oneCount;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight2(11));
    }
}
