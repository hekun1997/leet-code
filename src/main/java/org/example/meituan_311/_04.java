package org.example.meituan_311;

import java.util.*;

/**
 * Created by hekun on 2023/3/11 20:24
 */
public class _04 {
    static String top = "t";
    static String left = "l";
    static String right = "r";
    static String down = "d";

    Set<String> dGet = new HashSet<>();
    Set<String> wGet = new HashSet<>();

    public String xyToStr(int[] pos) {
        return pos[0] + "," + pos[1];
    }

    public int[] strToXy(String str) {
        int[] pos = new int[2];
        pos[0] = Integer.valueOf(str.charAt(0));
        pos[1] = Integer.valueOf(str.charAt(1));
        return pos;
    }

    public Map<String, String> doIndex(Character index, int[] pos, String to, Set<String> get) {
        Map<String, String> result = new HashMap<>();
        int x = pos[0];
        int y = pos[1];
        switch (index){
            case 'U':
                to = top;
                if (x-1 > 0 && !get.contains((x-1) + "," + (y))) {
                    pos[1] -= 1;
                    get.add((x-1) + "," + (y));
                }
                break;
            case 'D':
                to = down;
                if (x + 1 < 16 && !get.contains((x+1) + "," + (y))) {
                    pos[0] += 1;
                    get.add((x+1) + "," + (y));
                }
                break;
            case 'L':
                to = left;
                if (y-1 > 0 && !get.contains((x) + "," + (y-1))) {
                    pos[1] -= 1;
                    get.add((x) + "," + (y-1));
                }
                break;
            case 'R':
                to = right;
                if (y+1 < 16 && !get.contains((x) + "," + (y+1))) {
                    pos[1] += 1;
                    get.add((x) + "," + (y-1));
                }
                break;
        }
        return result;
    }

    public void solution(String dStr, String wStr) {
        int max = 256;
        int curr = 0;
        int[] dPos = {0, 0};
        int[] wPos = {15, 15};

        String dTo = right;  // l r t b
        String wTo = left;

        String dWon = "D";
        String wWon = "W";

        for (int i = 0; i < max; i++) {
            Character dDo = dStr.charAt(i);
            if (dDo != 'F') {
                doIndex(dDo, dPos, dTo, dGet);
            } else {
                if ((dTo == left || dTo == right) && (dPos[0] == wPos[0])) {
                    System.out.println(i + 1);
                    System.out.println(dWon);
                }
                if ((dTo == top || dTo == down) && (dPos[1] == wPos[1])) {
                    System.out.println(i + 1);
                    System.out.println(dWon);
                }
            }

            Character wDo = wStr.charAt(i);
            if (dDo != 'F') {
                doIndex(wDo, wPos, wTo, wGet);
            } else {
                if ((wTo == left || wTo == right) && (dPos[0] == wPos[0])) {
                    System.out.println(i + 1);
                    System.out.println(wWon);
                }
                if ((wTo == top || wTo == down) && (dPos[1] == wPos[1])) {
                    System.out.println(i + 1);
                    System.out.println(wWon);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dDo = scanner.next();
        String wDo = scanner.next();

    }
}
