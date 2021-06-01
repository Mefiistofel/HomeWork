package lesson_3;

public class Task_5 {
    public static int[] initialValue (int len, int initialValue) {
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = initialValue;
            
        }
        return a;

    }
}
