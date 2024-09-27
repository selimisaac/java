
public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    private final int NBRCAGES=25;
    int nbr_animal;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        animals = new Animal[NBRCAGES]; // Maximum 25 animaux
        nbr_animal = 0;
    }


    public boolean addAnimal(Animal animal) {
        if (nbr_animal < NBRCAGES)
        {
            animals[nbr_animal] = animal;
            nbr_animal++;
            return true;
        }
        else {
            return false;
        }
    }


    pubic boolean removeAnimal(Animal animal){
        for (int i = 0 ; i <nbr_animal ;i++){
            if(animals[i])name.equals(animal.name)){
                 for (int j=0 ; j < nbr_animal - 1 ; j++){
                       animals[j] = animals[j+1];
                }
                 animals[nbr_animal - 1] = null;
                 nbr_animal--;
                 return true;
            }
        }
        return false;
    }


    public boolean isZooFull(){
        return nbr_animal >= NBRCAGES;
    }


    public void displayAnimals(){
        System.out.println("Animaux dans le zoo" + name + ":");
        for (int i = 0; i < nbr_animal; i++){
            System.out.println(animals[i]);
        }
    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbr_animal i++){
            if (animals[i].name.equals(animal.name)){
                return i;
            }
        }
        return -1;
    }


    public static Zoo comparerZoo(Zoo z1 , Zoo z2){
        return new (z1.nbr_animal > z2.nbr_animal) ? z1 : z2 ;
    }
    @Override
    public string toString(){
        return "Zoo{name='" + name + "', city='" + city + "'}";
    }
}
