import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                // Check for byte
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }

                // Check for short
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }

                // Check for int
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                // Check for long (no need for additional check since long is the largest)
                System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}

