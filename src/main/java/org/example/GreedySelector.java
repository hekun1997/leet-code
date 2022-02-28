package org.example;

public class GreedySelector {
    /**
     入口方法.
     */
    public static void main(String args[]){
        int [] startTimes  = {4, 2, 6, 5, 9, 8};
        int [] finishTimes = {4, 6, 8, 10, 11, 12};

        boolean [] isSelected = new boolean[12];

        int successActivity = greedySelector(startTimes, finishTimes, isSelected);

        for(int i = 1; i <= 11; i++){
            if (isSelected[i]){
                System.out.print(startTimes[i] + "->" + finishTimes[i] + "\t");
            }//Of if
        }//Of for

        System.out.println("\n" + successActivity + " activities are successfully scheduled.");
    }//Of main

    /**
     *********************************
     * 获取最优解，即最多活动数.
     * @param s 开始时间向量.
     * @param f 结束时间向量.
     * @param a 是否安排.
     *********************************
     */
    public static int greedySelector(int []s, int []f, boolean a[]){
        int n = s.length - 1;

        a[1] = true;
        int j = 1;
        int count = 1;
        for (int i = 2; i <= n; i ++){
            if (s[i] >= f[j]){
                a[i] = true;
                j = i;
                count ++;
            }else{
                a[i] = false;
            }//Of if
        }//Of for

        return count;
    }//Of greedySelector

}
