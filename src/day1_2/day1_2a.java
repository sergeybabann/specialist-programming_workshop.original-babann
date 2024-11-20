package day1_2;

import java.util.Scanner;

public class day1_2a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner - object type, scan - object name

        int a, b = 5, c = -2;
        a = -c; // - operator (this is remainder from division)
        System.out.println(a); // result 2

        int a1, b1 = 5, c1 = -2;
        a1 = +c1;
        System.out.println(a1); // result -2

        int a2, b2 = 5, c2 = -2;
        a2 = -b2 + c2;
        System.out.println(a2); // result -7

        int a3, b3 = 5, c3 = -2;
        a3 = +(c3 - b3);
        System.out.println(a3); // result -7
    }
}
