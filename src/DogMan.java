/*
Ryan Chien
Period 4
Abstract Methods
SuperHero
 */

public class DogMan extends SuperHero{
    public DogMan() {
        super();
    }

    public DogMan(String suitColor, boolean hasCape) {
        super(suitColor, hasCape);
    }

    public String getName() {
        return "DogMan";
    }

    public String motto() {
        return "Woof woof";
    }
}
