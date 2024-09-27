

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal lionDuplicate = new Animal("Felidae", "Lion", 3, true);

        Zoo myZoo1 = new Zoo("Safari Park", "Paris");
        Zoo myZoo2 = new Zoo("Jurassic park", "Costa Rica");


        System.out.println(myZoo1.addAnimal(lion));
        System.out.println(myZoo1.addAnimal(tiger));
        System.out.println(myZoo1.addAnimal(lionDuplicate));


        myZoo1.displayAnimals();


        System.out.println(myZoo1.removeAnimal(lion));
        myZoo1.displayAnimals();


        for (int i = 0; i < 30; i++) {
            Animal newAnimal = new Animal("Family" + i, "Animal" + i, i, true);
            System.out.println("Ajout de " + newAnimal.name + ": " + myZoo1.addAnimal(newAnimal));
        }


        Zoo largerZoo = Zoo.comparerZoo(myZoo1, myZoo2);
        System.out.println("Le zoo avec le plus d'animaux est: " + largerZoo.name);
    }
}
