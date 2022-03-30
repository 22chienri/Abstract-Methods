public class Boxer extends DogBreeds {
    public Boxer(double averageCost, String group, int averageWeight, int averageHeight) {
        super(averageCost, group, averageWeight, averageHeight);
    }

    public void bark() {
        System.out.println("Bark");
    }
}
