import java.util.Arrays;
import java.util.List;

public class ArrayCount {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1,3,5,6,8,4,1,14);
        int sum = 14;
        int firstValue = 0;

        for(int i=0; i< array.size(); i++) {
            firstValue = array.get(i);
            for(int j=1; j< array.size()-1; j++) {
                int secondValue = array.get(j);
                if (firstValue+secondValue == sum && array.contains(sum)) {
                    System.out.println("Sum found! Numbers are: " + firstValue + "," + secondValue);
                    break;
                }
            }
        }
    }
}
