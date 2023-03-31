public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");
        Dog shibaInu = new Dog("Shiba Inu", 25, "Pointed", "Curled");
        doAnimalStuff(shibaInu, "fast");

        Dog wolf = new Dog("Wolf", 40.0);
        doAnimalStuff(wolf, "slow");

        Fish goldfish = new Fish("Golfish", .25, 2, 3);
        doAnimalStuff(goldfish, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
