package org.example;

import java.util.Arrays;

public class FindLongestCommonSubsequence {
    /**
     * The first sequence.
     */
    String firstSequence;

    /**
     * The second sequence.
     */
    String secondSequence;

    /**
     * The length of the first sequence.
     */
    int m;

    /**
     * The length of the second sequence.
     */
    int n;

    /**
     * Store the length of the longest common subsequence.
     */
    int[][] cMatrix;

    /**
     * Store the trace to construct the subsequence.
     */
    int[][] bMatrix;

    /**
     * Construct the matrices.
     */
    public void constructLCS(String paraStr1, String paraStr2) {
        firstSequence = paraStr1;
        secondSequence = paraStr2;

        n = firstSequence.length();
        m = secondSequence.length();
        cMatrix = new int[n + 1][m + 1];
        bMatrix = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                cMatrix[i][j] = 0;
                bMatrix[i][j] = 0;
            } // Of for j
        } // Of for i

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (firstSequence.charAt(i - 1) == secondSequence.charAt(j - 1)) {
                    cMatrix[i][j] = cMatrix[i - 1][j - 1] + 1;
                    bMatrix[i][j] = 1;
                } else if (cMatrix[i - 1][j] > cMatrix[i][j - 1]){
                    cMatrix[i][j] = cMatrix[i - 1][j];
                    bMatrix[i][j] = 3;
                }else{
                    cMatrix[i][j] = cMatrix[i][j - 1];
                    bMatrix[i][j] = 2;
                } // Of if
            } // Of for j
        } // Of for i

        System.out.println("c: " + Arrays.deepToString(cMatrix));
        System.out.println("b: " + Arrays.deepToString(bMatrix));
    }// Of constructLCS

    /**
     * Output the length and the subsequence.
     */
    public void output() {
        System.out.println("The length is: " + cMatrix[m][n]);
        int i = m;
        int j = n;
        String resultString = "";
        while (i > 0 && j > 0){
            if (bMatrix[i][j] == 1) {
                resultString = firstSequence.charAt(i - 1) + resultString;
                i --;
                j --;
            } else if (bMatrix[i][j] == 2) {
                j --;
            } else {
                i --;
            }//Of if
        }//Of while

        System.out.println("The subsequence is: " + resultString);
    }//Of output

    public static void main(String[] args) {
        String str1 = "CABA";
        String str2 = "ACAA";
        FindLongestCommonSubsequence tempLCS = new FindLongestCommonSubsequence();
        tempLCS.constructLCS(str1, str2);
        tempLCS.output();
    }// Of main
}
