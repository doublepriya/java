public class Main 
{
    public static int findhcf(int a, int b)
    {
        int hcf = 1; // Initialize HCF to 1 (the minimum possible HCF)

        // Iterate from 1 to the minimum of a and b
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) { // Check if i is a common divisor
                hcf = i; // Update HCF to the current i
            }
        }
        return hcf;
    }

    public static void main(String[] args) 
    {
        int num1 = 56;
        int num2 = 98;
        int hcf = findhcf(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
