package java11;

import java.util.Scanner; // library connection

public class day11 {
    public static void main (String[] args) { // entry point
        Scanner scan = new Scanner(System.in); // Scanner - object type, scan - object name

        int a,b,c; // a - variable, int - type

        System.out.println("input 3 int:"); // print the text - input 3 int
        a = scan.nextInt(); // a - variable, scan - object, nextInt() - method
        b = scan.nextInt();
        c = scan.nextInt();

        int summa;
        summa = a + b + c; // the result of adding these variables is added to the variable sum

        System.out.println(summa); // print the result of addition
    }
}