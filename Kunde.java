package swp_2aHWII.htlInn.oop.onlineshop.swp_onlineshop;

public class Kunde {
    private String vorname;
    private String nachname;
    private Anschrift anschrift;

    public Kunde (){

    }
    public Kunde (Anschrift anschrift,String nachname,String vorname){
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschrift = anschrift;
    }
    public Kunde (String nachname,String vorname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void kundenProfilAnzeigen(){
        System.out.printf("\n  %s %s \n %s",nachname,vorname,anschrift.getAdresse());
    }

    public void setAnschrift(Anschrift anschrift){
        this.anschrift = anschrift;

    }

}
