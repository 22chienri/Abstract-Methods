public class Dachsund extends DogBreeds {
    public Dachsund(double averageCost, String group, int averageWeight, int averageHeight) {
        super(averageCost, group, averageWeight, averageHeight);
    }

    public void bark() {
        System.out.println("Arf");
    }
}
