package day1_1;

import java.util.Scanner;

public class day1_1b {
    public static void main(String[] args) { // entry point
        Scanner scan = new Scanner(System.in); // Scanner - object type, scan - object name

        double a, b, c; /* a - variable, double - type */

        System.out.println("input 3 double:"); // print the text -/ input 3 double
        a = scan.nextDouble(); // a - variable, scan - object, nextDouble() - method,
        b = scan.nextDouble();
        c = scan.nextDouble();

        double summa;
        summa = a + b + c; // the result of adding these variables is added to the variable summa

        System.out.println(summa); // print the result of addition

        String name;
        System.out.println("input name:");
        name = scan.next();
        System.out.println(name);
    }
}
