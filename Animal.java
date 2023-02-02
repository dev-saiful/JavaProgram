
public class Animal {

    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    Animal() {

    }

    Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public void setVegetarian(boolean vegetarian) {

        this.vegetarian = vegetarian;
    }

    public boolean getVegetarian() {
        return vegetarian;
    }

    public void setEats(String eats) {

        this.eats = eats;
    }

    public String getEats() {
        return eats;
    }

    public void setnoOfLegs(int noOfLegs) {

        this.noOfLegs = noOfLegs;
    }

    public int getonOfLegs() {
        return noOfLegs;
    }

    public boolean isVegetarian() {
        if (this.vegetarian == true) {
            return true;
        } else {
            return false;
        }
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
