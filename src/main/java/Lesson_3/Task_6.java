package Lesson_3;

public class Task_6 {
    public static void main(String[] args) {
        minElement();
    }

    public static void minElement() {

        int[] a = {-2,0,1,12,3,9,99,15,-3,3,-66,34,-12};

        int min = a[0];
        int max = a[0];

        for (int j : a) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.printf("min = %d, max = %d,", min, max );
    }
}
