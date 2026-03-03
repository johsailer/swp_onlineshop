package swp_2aHWII.htlInn.oop.onlineshop.swp_onlineshop;

public class Kunde {
    private String vorname;
    private String nachname;
    private String anschrift;

    public Kunde (){

    }
    public Kunde (String anschrift,String nachname,String vorname){
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschrift = anschrift;
    }

    public void kundenProfilAnzeigen(){
        System.out.printf("\n %s %s %s",anschrift,nachname,vorname);
    }
}
