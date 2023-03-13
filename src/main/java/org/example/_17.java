package org.example;

import java.util.*;

/**
 * Created by hekun on 2023/1/14 15:33
 */
public class _17 {

    Map<String, List<String>> map = new HashMap<>();

    public List<String> combinations(String digits, int index) {
        // end
        if (index == digits.length()-1){
            return map.get(digits.substring(index));
        }
        // curr
        List<String> curr = map.get(String.valueOf(digits.charAt(index)));
        List<String> next = combinations(digits, index+1);
        List<String> result = new ArrayList<>();
        for (String tempCurr : curr) {
            for (String tempNext : next) {
                result.add(tempCurr + tempNext);
            }
        }
        // next
        return result;
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() < 1) {
            return new ArrayList<>();
        }
        map.put("2", Arrays.asList("a", "b", "c"));
        map.put("3", Arrays.asList("d", "e", "f"));
        map.put("4", Arrays.asList("g", "h", "i"));
        map.put("5", Arrays.asList("j","k","l"));
        map.put("6", Arrays.asList("m","n","o"));
        map.put("7", Arrays.asList("p","q","r","s"));
        map.put("8", Arrays.asList("t","u","v"));
        map.put("9", Arrays.asList("w","x","y","z"));
        return combinations(digits, 0);
    }
    public static void main(String[] args) {
        System.out.println(new _17().letterCombinations("23"));
    }
}
