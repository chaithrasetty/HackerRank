import java.util.Collections;
import java.util.Vector;

public class SortNumbers {
    public static void main(String[] args) {
        int [] array = new int [] {2,-6,-3,1,5,4};

        System.out.println("Input Array:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        Vector<Integer> ans = new Vector<>();
        for(int i =0;i<array.length;i++){
            if(array[i] >= 0){
                ans.add(array[i]);
            }
        }
        Collections.sort(ans);

        int j =0;
        for(int i=0; i < array.length; i++){
            if(array[i] >= 0){
                array[i] = ans.get(j);
                j++;
            }
        }

        System.out.println("\nSorted Array:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
