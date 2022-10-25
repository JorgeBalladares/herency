package domain.hereditary;

import domain.father.Instrument;

public class Dumb extends Instrument {

    private int numberOfKettledrums;
    private int numberOfPlates;


    public Dumb(String name, String type, int price, String marca) {
        super(name, type, price, marca);
    }

    public Dumb(String name, String type, int price, String marca, int numberOfKettledrums, int numberOfPlates) {
        super(name, type, price, marca);
        this.numberOfKettledrums = numberOfKettledrums;
        this.numberOfPlates = numberOfPlates;
    }

    public int getNumberOfKettledrums() {
        return numberOfKettledrums;
    }

    public void setNumberOfKettledrums(int numberOfKettledrums) {
        this.numberOfKettledrums = numberOfKettledrums;
    }

    public int getNumberOfPlates() {
        return numberOfPlates;
    }

    public void setNumberOfPlates(int numberOfPlates) {
        this.numberOfPlates = numberOfPlates;
    }

    public String pound(){
        return "The dumb is playing, POUND!! ";
    }

    @Override
    public String playInstrument() {
        return pound() + this.getName();
    }

    @Override
    public String toString() {
        return "Dumb{" +
                "name='" + this.getName() + '\'' +
                ", type='" + this.getType() + '\'' +
                ", price=" + this.getType() +
                ", marca='" + this.getMarca() + '\'' +
                ", tuned=" + this.getTuned() +
                "numberOfKettledrums=" + numberOfKettledrums +
                ", numberOfPlates=" + numberOfPlates +
                '}';
    }
}
