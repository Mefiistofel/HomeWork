package lesson_3;

import java.util.Arrays;

public class Task_8 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(shiftArray(new int[]{1, 2, 3, 4, 5, 6}, -2)));
    }

    public static int[] shiftArray(int[] a, int n) {
        int length = a.length;
        if (length != 0) {
            n %= length;
        } else {
            return a;
        }

        if (n < 0) {
            for (int j = 0; j > n; j--) {
                for (int i = 0; i < length - 1; i++) {
                    int c = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = c;
                }
            }
        } else {
            for (int j = 0; j < n; j++) {
                for (int i = length - 1; i > 0; i--) {
                    int c = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = c;
                }
            }
        }

        return a;
    }

}
