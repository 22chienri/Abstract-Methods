/*
Ryan Chien
Period 4
Abstract Methods
SuperHero
 */

public abstract class SuperHero {
    private String suitColor;
    private boolean hasCape;

    public SuperHero() {
        this.suitColor = "";
        this.hasCape = false;
    }

    public SuperHero(String suitColor, boolean hasCape) {
        this.suitColor = suitColor;
        this.hasCape = hasCape;
    }

    public void setSuitColor(String suitColor) {
        this.suitColor = suitColor;
    }

    public String getSuitColor() {
        return this.suitColor;
    }

    public void setCape(boolean cape) {
        this.hasCape = cape;
    }

    public boolean isCaped() {
        return hasCape;
    }

    public abstract String getName();

    public abstract String motto();

    public String toString() {
        return getName() + "\t" + isCaped() + "\t" + getSuitColor() + "\t" + motto();
    }

}
