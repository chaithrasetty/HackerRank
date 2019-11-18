package CompareTriplets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
Sample Input:
17 28 30
99 16 8

Sample Output:
2 1
 */
public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<>();
        int i = 0, awardPointA = 0, awardPointB = 0;

        while (i < a.size()) {
            if (a.get(i) > b.get(i)) {
                awardPointA++;
            } else if (a.get(i) < b.get(i)) {
                awardPointB++;
            }
            i++;
        }

        result.add(awardPointA);
        result.add(awardPointB);
        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);
        System.out.println(result.stream().map(Object::toString).collect(joining(" ")));

        bufferedReader.close();
    }
}
