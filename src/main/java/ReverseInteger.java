public class ReverseInteger {

    public static int reverse(int x) {
        long temp = 0;
        long xx = x;
        boolean posit = x >= 0;
        if (!posit){xx *= -1;}
        while (xx > 0){
            temp = temp * 10 + xx % 10;
            xx /= 10;
        }
        long rt = posit ? temp : -1 * temp;
        if (rt > Integer.MAX_VALUE || rt  < Integer.MIN_VALUE){
            return 0;
        }
        return (int) rt;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
