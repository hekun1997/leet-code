package org.example.algorithm;

public class chapter1 {
    public static double[] reverseArray(double[] dArray) {
        /**
         *         double[] dArray = new double[]{1, 2, 3, 4, 5};
         *         reverseArray(dArray);
         *         for (int i = 0; i < dArray.length; i++) {
         *             System.out.println(dArray[i]);
         *         }
         */
        int length = dArray.length;
        double temp;
        for (int i = 0; i < length / 2; i ++) {
            temp = dArray[i];
            dArray[i] = dArray[length - 1 - i];
            dArray[length - 1 - i] = temp;
        }
        return dArray;
    }

    public static double[][] multiMatrix(double[][] aArray, double[][] bArray) {
        //假设aArray bArray 均为N*N大小的矩阵
        /**
         *         double[][] aArray = new double[][]{{1}};
         *         double[][] bArray = new double[][]{{1}};
         *         int length = aArray.length;
         *         double[][] cArray = multiMatrix(aArray, bArray);
         *         for (int i = 0; i < length; i++) {
         *             for (int j = 0; j < length; j++) {
         *                 System.out.println(cArray[i][j]);
         *             }
         *         }
         */
        int length = aArray.length;
        double[][] cArray = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    cArray[i][j] += aArray[i][k] * bArray[k][j];
                }
            }
        }
        return cArray;
    }

    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }
        for (int i = 2; i * i <= N; i ++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }

    public static double mySqrt(double n) {
        double start = 0;
        double end = n;
        double mid = (start + end) / 2;
        double err = 1e-15;
        double currSqrt = mid * mid;
        while (Math.abs(n - currSqrt) > err) {
            currSqrt = mid * mid;
            if (currSqrt > n) {
                end = mid;
            } else {
                start = mid;
            }
            mid = (start + end) / 2;
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(1 / 0.0);
    }
}
