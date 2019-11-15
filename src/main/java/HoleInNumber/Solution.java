package HoleInNumber;

import java.util.Scanner;

public class Solution {
    public static int countHoles = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        for(int i=0; i<input.length;i++){
            if(input[i].length() == 1) {
                count(input[i]);
                System.out.println("Input: "+ input[i] +" Count: " + countHoles);
            } else {
                for(int j= 0; j<input[i].length(); j++){
                    count(String.valueOf(input[i].charAt(j)));
                }
                System.out.println("Input: "+ input[i] + " Count: " + countHoles);
                countHoles = 0;
            }
        }
    }

    public static void count(String input){
        if (input.equals("8")) {
            countHoles += 2;
        } else if (input.equals("0") || input.equals("4") || input.equals("6") || input.equals("9")) {
            countHoles++;
        }
    }
}
