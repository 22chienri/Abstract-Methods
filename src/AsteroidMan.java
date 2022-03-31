/*
Ryan Chien
Period 4
Abstract Methods
SuperHero
 */

public class AsteroidMan extends SuperHero{
    public AsteroidMan() {
        super();
    }

    public AsteroidMan(String suitColor, boolean hasCape) {
        super(suitColor, hasCape);
    }

    public String getName() {
        return "AsteroidMan";
    }

    public String motto() {
        return "I will crush you";
    }
}
