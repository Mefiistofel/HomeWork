package lesson_4;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CrossZero {



//  0) Задаем размер поля
//  1) Создаем поле
//  2) Ход первого игрока (вводим координаты, заполняем поле)
//  3) Проверка победы
//  4) Проверяем заполнено ли поле(ничья)
//  5) Ход (ИИ), если не победил человек (рандомные координаты, заполнить поле)
//  6) Проверка победы
//  7) Проверка заполнено ли поле(ничья)
//  8) Возврат к пункту 2
//  9) Предложить сыграть еще раз

    public static class Main {
        private static final char DOT_EMPTY = '.';
        private static final char DOT_X = 'X';
        private static final char DOT_O = 'O';
        private static int size = 3;
        private static char[][] map;
        private static Scanner scanner = new Scanner(System.in);
        private static ThreadLocalRandom random = ThreadLocalRandom.current();

        public static void main(String[] args) {
            sizeMap();
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (isWin(DOT_X)) {
                    System.out.println("Вы победили");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (isWin(DOT_O)) {
                    System.out.println("Победил ИИ");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }

            System.out.println("Игра окончена");

            scanner.close();
        }

        // 4) Проверяем заполнено ли поле(ничья)
        private static boolean isMapFull() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }

        // 3) Проверка победы
        private static boolean isWin(char symbol) {
            int count = 0;
            for (int i = 0; i < size; i++) {
                // Проверка строки i
                count = 0;
                for (int j = 0; j < size; j++) {
                    if (map[i][j] == symbol) {
                        count++;
                        if (count == size) return true;
                    }
                }
                // Проверка столбца i
                count = 0;
                for (int j = 0; j < size; j++) {
                    if (map[j][i] == symbol) {
                        count++;
                        if (count == size) return true;
                    }
                }
            }
            // Проверка диоганали 1
            count = 0;
            for (int i = 0; i < size; i++) {
                if (map[i][i] == symbol) {
                    count++;
                    if (count == size) return true;
                }

            }
            // Проверка диоганали 2
            count = 0;
            for (int i = 0; i < size; i++) {
                int j = size - 1 - i;
                if (map[i][j] == symbol) {
                    count++;
                    if (count == size) return true;
                }
            }

            return false;
        }

        // 0) Задаём размер поля
        private static void sizeMap() {
            while (true) {
                int maxSizeMap = 5;
                System.out.println("Задайте размер поля, введите число от 3 до " + maxSizeMap);
                try {
                    size = scanner.nextInt();
                } catch (NoSuchElementException | IllegalStateException e) {
                    System.out.println("Вы вели не число");
                    scanner = new Scanner(System.in);
                }
                if (size >= 3 && size <= maxSizeMap) {
                    System.out.println("Размер поля " + size + " x " + size);
                    break;
                } else System.out.println("Вы ввели неверное значение");
            }
        }

        //5) Ход (ИИ), если не победил человек (рандомные координаты, заполнить поле)
        private static void aiTurn() {
            int x;
            int y;
            System.out.println("Ход компьютера");
            do {
                x = random.nextInt(0, size);
                y = random.nextInt(0, size);
            } while (!isValid(x, y));

            map[y][x] = DOT_O;
        }

        private static void humanTurn() {
            int x = -1;
            int y = -1;

            do {
                try {
                    System.out.println("Введите координаты X и Y");
                    x = scanner.nextInt() - 1;
                    y = scanner.nextInt() - 1;
                } catch (NoSuchElementException | IllegalStateException e) {
                    System.out.println("Введите числа");
                    scanner = new Scanner(System.in);
                }

            } while (!isValid(x, y));

            map[y][x] = DOT_X;
        }

        // Проверяет что x и y входят в заданные границы (размер поля) и в этом месте находится доллар
        private static boolean isValid(int x, int y) {
            return x >= 0 && x < size
                    && y >= 0 && y < size
                    && map[y][x] == DOT_EMPTY;
        }

        //1) Создаем поле
        private static void initMap() {
            map = new char[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        // Печатаем массив
        private static void printMap() {
            System.out.println();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
