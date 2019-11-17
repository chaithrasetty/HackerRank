package Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        return (generateAnagramKey(a).equals(generateAnagramKey(b))) ;
    }

    static String generateAnagramKey(String str) {
        char[] letters = str.toLowerCase().toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
