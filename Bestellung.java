package swp_2aHWII.htlInn.oop.onlineshop.swp_onlineshop;

import java.util.ArrayList;

public class Bestellung {
    private int bestellNummer;
    private Kunde kunde;
    private ArrayList<Produkt> warenkorb;

    public Bestellung(int bestellNummer, Kunde kunde){
        this.bestellNummer = bestellNummer;
        this.kunde = kunde;
        this.warenkorb = new ArrayList<>();
    }

    public void produktHinzufuegen(Produkt p){
        this.warenkorb.add(p);
    }
    public void produktEntfernen(Produkt p){
        this.warenkorb.remove(p);
    }
    public void rechnungsDrucken(){
        kunde.kundenProfilAnzeigen();
        double gesSum = 0;
        for ( Produkt p : warenkorb){
            gesSum += p.getNettopreisPreis();
        }
        System.out.println(" "+ gesSum+"€");
    }

}
