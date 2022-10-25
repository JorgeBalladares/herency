package domain.hereditary;

import domain.father.Instrument;

public class Guitar extends Instrument {

    private int numberOfString;
    private String material;


    public Guitar(String name, String type, int price, String marca) {
        super(name, type, price, marca);
    }

    public Guitar(String name, String type, int price, String marca, int numberOfString, String material) {
        super(name, type, price, marca);
        this.numberOfString = numberOfString;
        this.material = material;
    }

    public int getNumberOfString() {
        return numberOfString;
    }

    public void setNumberOfString(int numberOfString) {
        this.numberOfString = numberOfString;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String playInstrument() {
        String phrase;
        if (getTuned() > 8) {
            phrase = "is sound correctly";
        } else {
            phrase = "is sound badly ";
        }
        return "Guitar " + phrase;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "name='" + this.getName() + '\'' +
                ", type='" + this.getType() + '\'' +
                ", price=" + this.getType() +
                ", marca='" + this.getMarca() + '\'' +
                ", tuned=" + this.getTuned() +
                "numberOfString=" + numberOfString +
                ", material='" + material + '\'' +
                '}';
    }
}


