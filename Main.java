package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the size of massive:");
        int x = in.nextInt();
        int[] massive = new int[x];
        System.out.println("Input the znacheniya of massive:");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = in.nextInt();
            int current = massive[i];
            int j = i - 1;
            while (j >= 0 && current < massive[j]) {
                massive[j + 1] = massive[j];
                j--;
            }
            massive[j + 1] = current;
        }
        for (int i = 0; i < massive.length; i++) {
            System.out.printf(massive[i] + " ");
        }
    }
}