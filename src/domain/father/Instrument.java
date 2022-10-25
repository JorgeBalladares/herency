package domain.father;

public class Instrument {

    private String name;
    private String type;
    private int price;
    private String marca;
    private int tuned;
    boolean isTuned;

    public Instrument(String name, String type, int price, String marca) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.marca = marca;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTuned() {
        return tuned;
    }

    public boolean tunedInstrument(){
        this.tuned = (int) Math.floor(Math.random() * 10 + 1);
        if(this.tuned>8){
            this.isTuned = true;
            return true;
        }else{
            this.isTuned = false;
            return false;
        }
    }

    public String isTuned(){
        if(tunedInstrument()){
            return this.name + " tuned";
        }
        else{
            return this.name + " not tuned";
        }
    }
    public String playInstrument() {
        return "The instrument " + this.name + " is playing";
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", marca='" + marca + '\'' +
                ", tuned=" + tuned +
                '}';
    }
}
