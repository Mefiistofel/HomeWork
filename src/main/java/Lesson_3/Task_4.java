package Lesson_3;

public class Task_4 {
    public static void main(String[] args) {
        fillDiagonals(4);
    }

    public static void fillDiagonals (int n) {

        int [][] a = new int[n][n];
        for (int i = 0; i < n; i++) {

            a[i][i] = 1;
            a[i][n - i - 1] = 1;
            
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + ", ");

            }

            System.out.println();

        }

    }
}
