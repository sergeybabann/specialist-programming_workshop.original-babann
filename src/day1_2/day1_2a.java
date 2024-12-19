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

        int a4, b4 = 5, c4 = -2;
        a4 = -(c4 - b4);
        System.out.println(a4); // result 7

        int a5, b5 = 5, c5 = -2;
        a5 = -c5;
        a5++; // a5 = a5 + 1;
        System.out.println(a5); // result 3

        int a6, b6 = 5, c6 = -2;
        a6 = -c6;
        b6 = a6++; // b6 = a6 | a6 + 1 |
        System.out.println(b6); // result 2

        int a7, b7 = 5, c7 = -2;
        a7 = -c7;
        b7 = ++a7; // a7 = a7 + 1 | b7 = a7
        System.out.println(b7); // result 3

        int a8, b8 = 5, c8 = -2;
        a8 = -c8;
        b8 = a8--; // b8 = a8 | a8--
        System.out.println(b8); // result 2

        int a9, b9 = 5, c9 = -2;
        a9 = -c9;
        b9 = --a9; // --a9 | b9 = a9
        System.out.println(b9); // result 1
    }
}
