public abstract class DogBreeds {
    private double averageCost;
    private final String group;
    private final int averageWeight;
    private final int averageHeight;

    public DogBreeds(double averageCost, String group, int averageWeight, int averageHeight) {
        this.averageCost = averageCost;
        this.group = group;
        this.averageWeight = averageWeight;
        this.averageHeight = averageHeight;
    }

    public void setAverageCost(double averageCost) {
        this.averageCost = averageCost;
    }

    public double getAverageCost() {
        return averageCost;
    }

    public abstract void bark();

    public String toString() {
        return "Average Cost: $" + averageCost + " Group: " + group + " Average Weight: " + averageWeight + " Average Height: " + averageHeight;
    }
}
