package day1_2;

import java.util.Scanner;

public class day1_2b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b = 5, c = -2;
        a = -c;
        System.out.println(a);

        b = a++;
        System.out.println(a);
        System.out.println(b);

        boolean f1 = true, f2 = false;
        f1 = !f1 || f2;
        System.out.println(f1);

    }

}
