package lesson_3;

public class Task_7 {
    public static void main(String[] args) {
        System.out.println(checkBalance(new int[]{1, 6, 7, 8, 9, 12, 3, 6, 12}));

    }

    public static boolean checkBalance (int [] a) {
        int sum = 0;

        for (int j : a) {
            sum += j;

        }
        if (sum % 2 != 0){
            return false;
        }
        for (int j : a) {
            sum -= j;
            if (sum == 0) {
                return true;
            }
        }
        return false;
    }
}
