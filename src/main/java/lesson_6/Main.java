package lesson_6;

public class Main {

    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catMurka = new Cat("Мурка");

        System.out.println("Количество животных " + Animal.getCountAnimal());
        System.out.println("Количество собак " + Dog.getCountDog());
        System.out.println("Количество кошек " + Cat.getCountCat());

        dogBobik.run(-1);
        dogBobik.run(140);
        dogBobik.run(540);
        dogBobik.swim(4);
        dogBobik.swim(40);

        catMurka.run(150);
        catMurka.run(350);
        catMurka.run(550);

        catMurka.swim(5);
    }
}
