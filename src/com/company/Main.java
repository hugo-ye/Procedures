package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] lol = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(alternate(lol)));
    }

    public static int sumUpTo(int n) { //homework2
        return n * (n + 1) / 2;
    }

    public static void oneToTwenty() { //homework2
        for (int i = 1; i <= 20; i++) {
            System.out.println(sumUpTo(i));
        }
    }

    public static boolean contains(int[] array, int value) { //homework3
        boolean contains = false;
        for (int i : array) {
            if (i == value) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public static boolean any(int[] a, int[] b) { //homework3
        boolean temp = false;
        for (int i = 0; i < a.length; i++) {
            if (contains(b, a[i])) {
                temp = true;
                break;
            }
        }
        return temp;
    }

    public static boolean prime(int n) { //homework4
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

    public static void inHundred() { //homework4
        for (int i = 2; i <= 100; i++) {
            System.out.print(prime(i) ? i + " " : "");
        }
    }

    public static void firstHundred() { //homework4
        int i = 2;
        int count = 0;
        while (count < 100) {
            System.out.print(prime(i) ? i + " " : "");
            count += prime(i) ? 1 : 0;
            i += 1;
        }
    }

    public static int[] reverse(int[] a) { //homework5
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
        return b;
    }

    public static boolean equal(int[] a, int[] b) { //homework5
        boolean same = true;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    same = false;
                    break;
                }
            }
        } else {
            same = false;
        }
        return same;
    }

    public static boolean palindrome(int[] array) { //homework5
        if (equal(array, reverse(array))) {
            return true;
        } else {
            return false;
        }
    }

    public static void remove(int[] in, int x, int[] out) { //homework6
        int inIndex = 0;
        int outIndex = 0;
        while (inIndex < in.length) {
            if (in[inIndex] == x) {
                outIndex += 0;
            } else {
                out[outIndex] = in[inIndex];
                outIndex++;

            }
            inIndex++;
        }
    }

    public static int[] alternate(int[] a) { //homework7
        int[] b = new int[a.length];
        int i = 0;
        int j = 0;
        while (i < a.length) {
            if (i % 2 == 0) {
                b[i] = a[j];
            } else {
                b[i] = a[a.length - 1 - j];
                j++;
            }
            i++;
        }
        return b;
    }

}
