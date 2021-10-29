public class ReverseStringInWords {

    public static char[] reverseString(char[] s) {
        char[] ans = new char[s.length];
        int k = s.length-1;
        for(int i=0; i<s.length; i++) {
            ans[k--] = s[i];
        }

        return ans;
    }

    public static String reverseWords(String s) {
        String[] stringArrays = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=0; i < stringArrays.length; i++) {
            char[] ans = reverseString(stringArrays[i].toCharArray());
            sb.append(String.valueOf(ans)).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s= "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
