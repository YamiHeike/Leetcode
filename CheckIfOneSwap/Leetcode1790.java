package CheckIfOneSwap;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;

        char[] first = s1.toCharArray();
        char[] second = s2.toCharArray();
        if(first.length != second.length) return false;

        int countDif = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < first.length; i++) {
            if(first[i] != second[i]) {
                countDif++;
                if(countDif > 2) return false;
                list.add(i);
            }
        }
        if(countDif != 2 && countDif != 0) return false;
        return first[list.get(0)] == second[list.get(1)] && first[list.get(1)] == second[list.get(0)];
    }
}
