package PairsWithSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {

    public static void main(String args[]) {

        List<Integer> a = Arrays.asList(1, 1, 2, 2, 3, 3);

        System.out.println(getPairsFast(1, a));
    }

    public static List<Pair> getPairsFast(int k, List<Integer> numbers) {
        HashSet<Integer> hLow = new HashSet<>();
        HashSet<Integer> hHigh = new HashSet<>();
        List<Pair> ret = new ArrayList<>();
        for (int i : numbers) {
            hLow.add(i);
            hHigh.add(i + k);
        }
        for (int i : hHigh) {
            if (hLow.contains(i)) {
                ret.add(new Pair(i - k, i));
            }
        }
        return ret;
    }
}


class Pair {
    public int a;
    public int b;
    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public String toString() {
        return "("+a+","+b+")";
    }
}



