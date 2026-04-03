package org.aditya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] numb, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        int n = numb.length;

        for (int i = 0; i < n; i++) {
            int complement = target - numb[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(numb[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int [] numb = {2, 3, 4, 9};
        var target = 7;

        TwoSum twoSum = new TwoSum();
        var result = twoSum.twoSum(numb, target);


        Arrays.stream(result).forEach(System.out::println);

    }
}
