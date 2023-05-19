package dynamicprogramming;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> have = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < t.length(); i++) {
            have.put(t.charAt(i), 0);
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }

        int left = 0;
        String res = "";
        int needed = t.length();
        int having = 0;
        for (int right = 0; right < s.length(); right++) {
            char rCh = s.charAt(right);
            if (have.containsKey(rCh)) {
                have.put(rCh, have.get(rCh) + 1);
                if (have.get(rCh) <= need.get(rCh)) {
                    having++;
                }
            }
            while (needed == having) {
                if (res.length() > s.substring(left, right + 1).length() || res == "") {
                    res = s.substring(left, right + 1);
                }
                left++;
                char curr = s.charAt(left - 1);
                if (have.containsKey(curr)) {
                    have.put(curr, have.get(curr) - 1);
                    if (have.get(curr) < need.get(curr)) {
                        having--;
                    }
                }
            }
        }
            return res;
    }

    private static boolean check(String substring, String t) {
        char[] arr = substring.toCharArray();
        for (int i = 0; i < t.length(); i++) {
            boolean found = false;
            for (int j = 0; j < substring.length(); j++) {
                if (t.charAt(i) == arr[j]) {
                    found = true;
                    arr[j] = '!';
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
