package lesson_3;

import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        int arraysSize = 11;

        Random random = new Random();
        int[] firstRandomArray = new int[arraysSize];
        int[] multiplyArray = new int[arraysSize];

        for (int i = 0; i < arraysSize; i++) {

            int randomValue = random.nextInt(11);

            firstRandomArray[i] = randomValue;

            if (randomValue < 6) {
              multiplyArray [i] = randomValue * 2;
            }
        }

        for (int i = 0; i < arraysSize; i++) {
            System.out.println(firstRandomArray[i] + " - " + multiplyArray [i]);
        }
    }
}