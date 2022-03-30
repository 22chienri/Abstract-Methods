public class BullDog extends DogBreeds{
    public BullDog(double averageCost, String group, int averageWeight, int averageHeight) {
        super(averageCost, group, averageWeight, averageHeight);
    }

    public void bark() {
        System.out.println("Ruff");
    }
}

