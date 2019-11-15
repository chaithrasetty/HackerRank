package CountHoles;

class Solution {

    static int countHoles(int num) {
        int holesInNumber[] = { 1, 0, 0, 0, 1, 0, 1, 0, 2, 1 };
        int holesCount = 0;

        while (num > 0) {
            int i = num % 10;
            holesCount += holesInNumber[i];
            num /= 10;
        }
        return holesCount;
    }

    public static void main(String[] args) {
        System.out.println(countHoles(888888888));
    }

}