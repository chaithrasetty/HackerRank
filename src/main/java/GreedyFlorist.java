import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GreedyFlorist {

    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);

        int result = 0;
        int customer = 0;
        int prevPurchase = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            result += c[i] * (prevPurchase + 1);

            customer++;
            if (customer == k) {
                customer = 0;
                prevPurchase++;
            }
        }
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int minimumCost = getMinimumCost(k, c);
        System.out.println(minimumCost);

        scanner.close();
    }
}

