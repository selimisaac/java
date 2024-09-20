
public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int NBRCAGES=25;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        animals = new Animal[NBRCAGES]; // Maximum 25 animaux
    }



}
