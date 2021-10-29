public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        int k=s1.length()/2;
        int j=0;
        for (int i = s1.length() - 1; i >= k; i--) {
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
