package lesson_7;

public class Main {
    public static void main(String[] args) {
        Cat [] cats = generateCats(7);
        Plate plate = new Plate(10);
        catsEat(plate, cats);
        System.out.println("\nДобавили в тарелку еды и зовем котов есть");
        catsEat(plate, cats);
    }

    public static Cat[] generateCats (int countCats) {
        Cat [] catsArray = new Cat[countCats];

        for (int i = 0; i < countCats; i++) {
            String catName = "Cat - " + String.valueOf(i);
            int appetite = 0;
            do {
                appetite = (int) (Math.random() * 5);
            } while (appetite == 0);

            catsArray[i] = new Cat(catName, appetite);
        }
        return catsArray;
    }

    public static void catsEat(Plate plate, Cat... cats) {
        for (Cat cat : cats) {
            if (cat.isSatiety()){
                System.out.println("Кот по имени " + cat.getName() + " сыт");
                continue;
            }
            cat.eat(plate);
            cat.toString();
        }
    }
}
