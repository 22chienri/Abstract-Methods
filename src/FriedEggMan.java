/*
Ryan Chien
Period 4
Abstract Methods
SuperHero
 */

public class FriedEggMan extends SuperHero {
    public FriedEggMan() {
        super();
    }

    public FriedEggMan(String suitColor, boolean hasCape) {
        super(suitColor, hasCape);
    }

    public String getName() {
        return "FriedEggMan";
    }

    public String motto() {
        return "The yolk is always watching you";
    }
}
