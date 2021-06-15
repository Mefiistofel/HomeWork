package lesson_3;

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        //Размер массивов
        int arraysSize = 10;

        Random random = new Random();
        //Первый random массив
        int[] firstRandomArray = new int[arraysSize];
        int[] targetArray = new int[arraysSize];

        //Идём по индексу массива
        for (int i = 0; i < arraysSize; i++) {

            //Сгененрировать число
            int randomValue = random.nextInt(2);

            //Добавляем в первый массив
            firstRandomArray[i] = randomValue;

            //Инвертируем число
            int invert = (randomValue == 0) ? 1 : 0;

            //Добавим инвертированное число во второй массив
            targetArray[i] = invert;
        }

        //Вывод массивов на консоль
        for (int i = 0; i < arraysSize; i++) {
            System.out.println(firstRandomArray[i] + " - " + targetArray[i]);
        }
    }
}