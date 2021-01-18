
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
//2.5 6.7
        double summa = 0;
        double kolvo = 0;
        boolean otric = false;
        double[] mas1 = {8.0, -2.0, 4.0, -6.0, 5.0, -8.0, 3.0, -6.0, -9.0, -3.0, 2.0, -7.0, -4.0, 1.0};
        for (int i = 0; i < mas1.length; i++) {

        }
        for (double mas : mas1) {
            if (mas < 0) {
                otric = true;
            } else {
                if (otric) {
                    kolvo++;
                    summa += mas;
                }
            }
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(summa / kolvo);

        sortArray(mas1);

        System.out.println(Arrays.toString(mas1));

    }

    public static void sortArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            double minValue = arr[i];
            for (int i1 = i; i1 < arr.length; i1++) {
                if (minValue > arr[i1]) {
                    double d = minValue;
                    minValue = arr[i1];
                    arr[i1] = d;


                }
            }
            arr[i] = minValue;
        }
    }
}