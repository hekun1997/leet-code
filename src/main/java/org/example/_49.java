package org.example;

import java.util.*;

/**
 * Created by hekun on 2023/3/19 11:27
 */
public class _49 {

    HashMap<String, HashMap<Character, Integer>> map = new HashMap<>();
    HashMap<String, List<String>> results = new HashMap<>();

    public boolean isAnagram(String key, String str) {
        HashMap<Character, Integer> count = map.getOrDefault(key, null);
        if (count == null) {  // not exists, init count
            count = new HashMap<>();
            for (int i = 0; i < key.length(); i++) {
                count.put(key.charAt(i), count.getOrDefault(key.charAt(i), 0) + 1);
            }
            map.put(key, count);
        }

        if (str.length() != key.length()) {
            return false;
        }

        HashMap<Character, Integer> strCount = new HashMap<>(count);
        for (int i = 0; i < str.length(); i++) {
            char tempKey = str.charAt(i);
            if (strCount.containsKey(tempKey)) {
                if (strCount.get(tempKey) > 1) {
                    strCount.put(tempKey, strCount.get(tempKey)-1);
                } else {
                    strCount.remove(tempKey);
                }
            } else {
                return false;
            }
        }

        return strCount.isEmpty();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        for (String str : strs) {
            boolean isAdd = false;
            for (String key : results.keySet()) {
                if (isAnagram(key, str)) {
                    results.get(key).add(str);
                    isAdd = true;
                }
            }
            if (!isAdd) {
                results.put(str, new ArrayList<>(Arrays.asList(str)));
            }
        }

        return new ArrayList<>(results.values());
    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> results = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String temp = Arrays.toString(chars);
            if (results.containsKey(temp)) {
                results.get(temp).add(str);
            } else {
                results.put(temp, new ArrayList<>(Arrays.asList(str)));
            }
        }

        return new ArrayList<>(results.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new _49().groupAnagrams2(strs));
    }
}
