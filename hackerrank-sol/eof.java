import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int n=1;
         while (scanner.hasNext()) {
            String token = scanner.nextLine();// filter each line or sentence
             // String token = scanner.next();--> filter each and every word 
            System.out.println(n+" "+token);
            n++;
        }
        scanner.close();
    }
} 
