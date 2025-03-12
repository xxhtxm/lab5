public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("мясо", "будка", "овчарка");
        Cat cat = new Cat("корм", "дом", "белый");
        Horse horse = new Horse("сено", "конюшня", "арабская");

        Veterinar veter = new Veterinar();
        veter.treatAnimal(dog);
        veter.treatAnimal(cat);
        veter.treatAnimal(horse);
        dog.makeNoise();
        dog.eat();
        dog.fetch();
        cat.makeNoise();
        cat.eat();
        cat.scratch();
        horse.makeNoise();
        horse.eat();
        horse.gallop();
    }
}
class Animal {
    public String food;
    public String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    public void makeNoise() {
        System.out.println("Животное издает звук");
    }
    public void eat() {
        System.out.println("Животное ест " + food);
    }
    public void sleep() {
        System.out.println("Животное спит");
    }
}
class Dog extends Animal {
    private String poroda;

    public Dog(String food, String location, String poroda) {
        super(food, location);
        this.poroda = poroda;
    }
    @Override
    public void makeNoise() {
        System.out.println("Собака лает.");
    }
@Override
    public void eat() {
        System.out.println("Собака ест " + food);
    }

    public void fetch() { System.out.println("Собака приносит мяч");}
}
class Cat extends Animal {
    private String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }
    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает");
    }
@Override
    public void eat() {
        System.out.println("Кошка ест " + food);
    }

    public void scratch() {
        System.out.println("Кошка точит когти");
    }
}
class Horse extends Animal {
    private String poroda;

    public Horse(String food, String location, String poroda) {
        super(food, location);
        this.poroda = poroda;
    }
    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест " + food);
    }

    public void gallop() {
        System.out.println("Лошадь галопирует");
    }
}
class Veterinar {
    public void treatAnimal(Animal animal) {
        System.out.println("Еда животного: " + animal.food);
        System.out.println("Местоположение животного: " + animal.location);
    }
}