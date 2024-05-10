package intern_project;

import java.util.Scanner;

public class simpleinterest {
    static int p = 0, t = 0, r = 0;

    // Method to take input from the user
    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Principle(p):");
        p = sc.nextInt();
        System.out.println("Enter the value of Time(t):");
        t = sc.nextInt();
        System.out.println("Enter the value of Rate(r):");
        r = sc.nextInt();
    }

    // Method to calculate simple interest and amount
    static void processing(int p, int t, int r) {
        // Calculate simple interest
        int si = (p * t * r) / 100;
        // Calculate amount
        int a = p + si;
        // Call output method to display results
        output(si, a);
    }

    // Method to display the results
    static void output(int si, int a) {
        System.out.println("The value of Simple Interest is: " + si);
        System.out.println("The value of Amount is: " + a);
    }

    public static void main(String[] args) {
        // Call input method to get principal, time, and rate from the user
        input();
        // Pass principal, time, and rate to the processing method to calculate SI and amount
        processing(p, t, r);
    }
}
