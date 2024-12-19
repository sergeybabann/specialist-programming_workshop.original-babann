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

        boolean f1 = true, f2 = true;
        f1 = !f2;
        System.out.println(f1); // result false

        boolean g1 = true, g2 = true;
        g1 = g1 && g2;
        System.out.println(g1); // result true

        boolean h1 = true, h2 = false;
        h1 = h1 && h2;
        System.out.println(h1); // result false

        boolean i1 = true, i2 = false;
        i1 = i1 || i2;
        System.out.println(i1); // result true

        boolean j1 = true, j2 = false;
        j1 = !j1 || j2;
        System.out.println(j1); // result false

    }

}
