/*
Ryan Chien
Period 4
Abstract Methods
SuperHero
 */

import java.util.ArrayList;

public class SuperHeroDriver {
    public static void main(String[] args) {
        // create variable for each superhero
        AsteroidMan asteroidman = new AsteroidMan("Red", true);
        FriedEggMan friedeggman = new FriedEggMan("Blue", false);
        DogMan dogman = new DogMan("Green", true);
        // create arraylist and add all heroes
        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>();
        heroes.add(asteroidman);
        heroes.add(friedeggman);
        heroes.add(dogman);
        // print out all heroes
        System.out.println("Heroes:");
        for (SuperHero hero : heroes) {
            System.out.println("*** " + hero.getName() + " ***");
            System.out.println("Suit Color: " + hero.getSuitColor() + " Has Cape: " + hero.isCaped() + " Motto: " + hero.motto());
        }
        // create 2d array of superheroes
        SuperHero[][] capedHeroes = new SuperHero[3][3];
        // add hero to capedheroes in the next available spot if hero has cape
        for (SuperHero hero : heroes) {
            if (hero.isCaped()) {
                outerloop:
                for (int i = 0; i < capedHeroes.length; i++) {
                    for (int j = 0; j < capedHeroes[i].length; j++) {
                        if (capedHeroes[i][j] == null) {
                            capedHeroes[i][j] = hero;
                            break outerloop;
                        }
                    }
                }
            }
        }
        // remove hero from heroes if hero hasCape
        heroes.removeIf(SuperHero::isCaped);

        for (int i = 0; i < capedHeroes.length; i++) {
            for (int j = 0; j < capedHeroes[i].length; j++) {
                if (capedHeroes[i][j] != null) {
                } else {
                    capedHeroes[i][j] = null;
                }
            }
        }
        // Print the suitColor, hasCape, and motto for each hero in the “hero” ArrayList and “capedHeroes” 2D array
        System.out.println("\nHeroes ArrayList:");
        for (SuperHero hero : heroes) {
            System.out.println("*** " + hero.getName() + " ***");
            System.out.println("Suit Color: " + hero.getSuitColor() + " Has Cape: " + hero.isCaped() + " Motto: " + hero.motto());
        }
        System.out.println("\nCapedHeroes 2D Array:");
        for (int i = 0; i < capedHeroes.length; i++) {
            for (int j = 0; j < capedHeroes[i].length; j++) {
                if (capedHeroes[i][j] != null) {
                    System.out.println("*** " + capedHeroes[i][j].getName() + " ***");
                    System.out.println("Suit Color: " + capedHeroes[i][j].getSuitColor() + " Has Cape: " + capedHeroes[i][j].isCaped() + " Motto: " + capedHeroes[i][j].motto());
                }
            }
        }


    }
}
