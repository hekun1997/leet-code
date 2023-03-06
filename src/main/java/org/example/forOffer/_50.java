package org.example.forOffer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by hekun on 2023/1/15 09:22
 */
public class _50 {
    public static char firstUniqChar(String s) {
        Map<Character, Integer> uniqChars = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            uniqChars.put(s.charAt(i), uniqChars.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Character key: uniqChars.keySet()) {
            if (uniqChars.get(key) == 1) {
                return key;
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        String s = "";
        System.out.println(firstUniqChar(s));
    }
}
