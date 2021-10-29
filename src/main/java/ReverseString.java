import java.util.Arrays;

public class ReverseString {

    public static char[] reverseString(char[] s) {
        char[] ans = new char[s.length];
//        int k = s.length-1;
//        for(int i=0; i<s.length; i++) {
//            ans[k--] = s[i];
//        }

        int k = 0;
        for(int i=s.length-1; i>=0; i--) {
            ans[k++] = s[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        System.out.println(Arrays.toString(reverseString(s)));
    }
}
