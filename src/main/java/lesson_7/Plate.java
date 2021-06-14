package lesson_7;

public class Plate {
    private int food;

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n > food) {
            System.out.println("В тарелке недостаточно еды");
            return false;
        }
        food -= n;
        return true;
    }

    public void info() {
        System.out.println("\nВ тарелке " + food + " ед. еды");
    }
}
