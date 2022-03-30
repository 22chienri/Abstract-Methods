public class Dalmation extends DogBreeds {
    public Dalmation(double averageCost, String group, int averageWeight, int averageHeight) {
        super(averageCost, group, averageWeight, averageHeight);
    }

    public void bark() {
        System.out.println("Woof woof");
    }
}
