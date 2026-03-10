package swp_2aHWII.htlInn.oop.onlineshop.swp_onlineshop;

public class Anschrift {
    private String postleitzahl;
    private String ort;
    private String straße;
    private String hausnummer;

    public Anschrift(){

    }

    public Anschrift (String postleitzahl, String ort, String straße, String hausnummer){
        this.postleitzahl = postleitzahl;
        this.ort = ort;
        this.straße = straße;
        this.hausnummer = hausnummer;
    }

    public String getAdresse(){
        String anschrift = postleitzahl + " " +  ort + " " + straße + " " + hausnummer;
        return anschrift;
    }



}
