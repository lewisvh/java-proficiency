//"Java Stdin and Stdout II" challenge

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        Double d = scan.nextDouble();
        scan.nextLine(); //clear input buffer
        String s = scan.nextLine();
      
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}