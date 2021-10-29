import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayNumbers {

        /*
         * Complete the 'reverseArray' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY a as parameter.
         */

        public static List<Integer> reverseArray(List<Integer> a) {
            // Write your code here
            List<Integer> reverse = new ArrayList<>();
            for (int i=a.size()-1;i>=0;i--) {
                reverse.add(a.get(i));
            }
            return reverse;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3);
        System.out.println(reverseArray(input));
    }
}
