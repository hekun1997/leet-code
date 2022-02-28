package org.example;

public class MatrixChain {
    /**
     * The memorize table.
     */
    boolean[][] calcuatedMatrix;

    /**
     * The best values.
     */
    int[][] mMatrix;

    /**
     * The matrices size array.
     */
    int[] pArray = {25, 100, 15, 300, 10};

    /**
     **************
     * The constructor, accept the matrix sizes.
     **************
     */
    public MatrixChain(){
        int n = pArray.length - 1;
        calcuatedMatrix = new boolean[n][n];
        mMatrix = new int[n][n];
    }//Of the constructor

    /**
     **************
     * Fill the table with best values.
     **************
     */
    public void fillTable(){
        recursiveFill(1, pArray.length);
    }//Of fillTable

    /**
     **************
     * Fill the table with best values.
     **************
     */
    public int recursiveFill(int paraLowerBound, int paraUpperBound){
        if (calcuatedMatrix[paraLowerBound][paraUpperBound]) {
            return mMatrix[paraLowerBound][paraUpperBound];
        }//Of if
        int retVal = 0;
        //Compare and return
        if (paraUpperBound - paraLowerBound == 2){
            retVal = mMatrix[paraLowerBound][paraUpperBound] = pArray[paraLowerBound] * pArray[paraLowerBound + 1] * pArray[paraUpperBound];
            calcuatedMatrix[paraLowerBound][paraUpperBound] = true;
        }else if(paraUpperBound - paraLowerBound == 1){
            retVal = mMatrix[paraLowerBound][paraUpperBound] = 0;
            calcuatedMatrix[paraLowerBound][paraUpperBound] = true;
        }else {
            return recursiveFill(paraLowerBound, paraUpperBound - 1);
        }
        return retVal;
    }//Of recursiveFill

    /**
     **************
     * The entrance.
     **************
     */
    public static void main(String args){
        MatrixChain tempChain = new MatrixChain();
        tempChain.recursiveFill(1, tempChain.mMatrix.length);
    }//Of recursiveFill
}
