package domain.hereditary;

public class ElectricGuitar extends Guitar {

    int potency;

    public ElectricGuitar(String name, String type, int price, String marca, int numberOfString, String material, int potency) {
        super(name, type, price, marca, numberOfString, material);
        this.potency = potency;
    }

    public ElectricGuitar(String name, String type, int price, String marca, int numberOfString, String material) {
        super(name, type, price, marca, numberOfString, material);
    }

    @Override
    public String playInstrument() {
        return "Electric " +super.playInstrument() + " with potency " + this.potency;
    }

    public int getPotency() {
        return potency;
    }

    public void setPotency(int potency) {
        this.potency = potency;
    }


    @Override
    public String toString() {
        return "ElectricGuitar{" +
                "name='" + this.getName() + '\'' +
                ", type='" + this.getType() + '\'' +
                ", price=" + this.getType() +
                ", marca='" + this.getMarca() + '\'' +
                ", tuned=" + this.getTuned() +
                "potency=" + potency +
                '}';
    }
}
