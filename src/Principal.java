import domain.father.Instrument;
import domain.hereditary.Dumb;
import domain.hereditary.ElectricGuitar;
import domain.hereditary.Guitar;
import domain.hereditary.Piano;

public class Principal{

    public static void main(String[] args) {
        Principal p = new Principal() ;
        Instrument[] instruments = p.createArrInstrument();
        p.startConcert(instruments);

    }

    public Instrument[] createArrInstrument(){
        Guitar guitar = new Guitar("guitar1", "Spanish", 250,"Cara", 6, "");
        ElectricGuitar electricGuitar = new ElectricGuitar("ElectricGuitar1", "thing", 400, "Cara", 5, "", 50);
        Dumb dumb = new Dumb("dumb1", "Cuban", 600, "Cara", 5, 3);
        Piano piano = new Piano("piano1", "withPedal", 2500, "Cara", 15, 5);

        //all types belong to array need to be thw same type, or we can define the type of array like object because all variables and object belong to this super class
        return new Instrument[]{guitar, electricGuitar, dumb, piano};
    }

    public void startConcert(Instrument[] instruments){
        for (Instrument instrument : instruments) {
            System.out.println(instrument.isTuned());
        }
        for (Instrument instrument : instruments) {
            if(instrument instanceof Dumb){
                //doing a casting because we can not access to a method belonging to Dumb because the variable created is an instrument type
                System.out.println(((Dumb) instrument).pound());
            }
            else{
                System.out.println(instrument.playInstrument());
            }
        }
    }

}
