package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hekun
 * @date 2024/5/23 14:56
 * @Description: TODO
 */
public class _242 {
    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            if (s == null && t == null) {
                return true;
            } else {
                return false;
            }
        }
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (Character key : countS.keySet()) {
            if (!countS.get(key).equals(countT.get(key))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }
}
