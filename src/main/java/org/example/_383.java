package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hekun
 * @date 2024/5/23 17:42
 * @Description: TODO
 */
public class _383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c: magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for (char c: ransomNote.toCharArray()){
            count = map.getOrDefault(c, 0);
            if (count <= 0) {
                return false;
            }
            map.put(c, count-1);
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
