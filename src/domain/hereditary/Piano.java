package domain.hereditary;

import domain.father.Instrument;

public class Piano extends Instrument {

    private int octaves;
    private int pedals;


    public Piano(String name, String type, int price, String marca) {
        super(name, type, price, marca);
    }

    public Piano(String name, String type, int price, String marca, int octaves, int pedals) {
        super(name, type, price, marca);
        this.octaves = octaves;
        this.pedals = pedals;
    }

    public int getOctaves() {
        return octaves;
    }

    public void setOctaves(int octaves) {
        this.octaves = octaves;
    }

    public int getPedals() {
        return pedals;
    }

    public void setPedals(int pedals) {
        this.pedals = pedals;
    }


    @Override
    public String toString() {
        return "Piano{" +
                "name='" + this.getName() + '\'' +
                ", type='" + this.getType() + '\'' +
                ", price=" + this.getType() +
                ", marca='" + this.getMarca() + '\'' +
                ", tuned=" + this.getTuned() +
                "octaves=" + octaves +
                ", pedals=" + pedals +
                '}';
    }
}
