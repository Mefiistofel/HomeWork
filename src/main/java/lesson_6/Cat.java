package lesson_6;

public class Cat extends lesson_6.Animal {
    private String name;
    private final int maxRun;
    private static int countCat = 0;

    public static int getCountCat() {
        return countCat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
        this.maxRun = 500;

        countCat++;
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength < 0)
            System.out.println("Длина препятствия отрицательная: " + obstacleLength
                    + " м. Укажите положительное значение.");
        else {
            System.out.println("Нужно пробежать " + obstacleLength + " м.");
            if (obstacleLength <= maxRun)
                System.out.println(name + " пробежала " + obstacleLength + " м.");
            else System.out.println(name + " пробежала " + maxRun + " м. и сошла с дистанции");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength < 0)
            System.out.println("Длина препятствия отрицательная: " + obstacleLength
                    + " м. Укажите положительное значение.");
        else System.out.println("Нужно проплыть " + obstacleLength + " м.");
        System.out.println(name + " не умеет плавать");
    }
}
