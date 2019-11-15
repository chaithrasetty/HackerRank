import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TwoRobots {

    /*
     * Complete the twoRobots function below.
     */
    static int twoRobots(int m, int[][] queries) {
        /*
         * Write your code here.
         */
        System.out.println("Total Number of Containers : " + m);
        int robotOnePosition = 0, robotTwoPosition = 0, robotOneDistance = 0, robotTwoDistance = 0;

        for(int i=0; i<queries.length; i++){
            if(i%2 ==0){
                robotOneDistance = calculateHopDistance("Robot 1", robotOnePosition, robotOneDistance,queries[i][0], queries[i][1] );
                robotOnePosition = queries[i][1];
            }else{
                robotTwoDistance =calculateHopDistance("Robot 2", robotTwoPosition, robotTwoDistance,queries[i][0], queries[i][1] );
                robotTwoPosition = queries[i][1];
            }
        }
        int total = robotOneDistance + robotTwoDistance;
        System.out.println("Total TwoPointsDistance.Distance : "+ total);
        return total;
    }

    private static int calculateHopDistance(String robotName, int robotPosition, int robotTotalDistance, int startContainer, int endContainer){
        int currentHop;
        if(robotPosition == 0){
            currentHop = Math.abs(startContainer - endContainer);
        }else{
            currentHop = Math.abs(robotPosition - startContainer) + Math.abs(startContainer - endContainer);
        }
        robotTotalDistance = robotTotalDistance + currentHop;
        System.out.println(robotName + " Assigned for job M"+startContainer +" -> M" + endContainer+ ", Travel TwoPointsDistance.Distance : " +currentHop);
        return robotTotalDistance;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int testCaseIndex = 0; testCaseIndex < t; testCaseIndex++) {
            String[] mn = scanner.nextLine().split(" ");

            int m = Integer.parseInt(mn[0].trim());

            int n = Integer.parseInt(mn[1].trim());

            int[][] queries = new int[n][2];

            for (int queriesRowItr = 0; queriesRowItr < n; queriesRowItr++) {
                String[] queriesRowItems = scanner.nextLine().split(" ");

                for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                    int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                    queries[queriesRowItr][queriesColumnItr] = queriesItem;
                }
            }

            int result = twoRobots(m, queries);
            System.out.println(result);
        }

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/
    }
}
