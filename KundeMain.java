package swp_2aHWII.htlInn.oop.onlineshop.swp_onlineshop;

public class KundeMain {
    public static void main(String[] args) {
        Anschrift a_k1 = new Anschrift("6170", "Zirl", "Kirchfeldstraße", "5");
        Kunde k1 =  new Kunde(a_k1 ,"sailer","johann");
        k1.kundenProfilAnzeigen();
/*
        Anschrift a_k2 = new Anschrift("6020", "Innsbruck", "Anichstraße", "26");
        Kunde k2 =  new Kunde(a_k2 ,"Hugo","vanHugo");
        k2.kundenProfilAnzeigen();

        Anschrift a_k3 = new Anschrift("6170","Zirl","Sonnenweg","17d");
        Kunde k3 = new Kunde("Schober", "Simon");
        k3.setAnschrift(a_k3);
        k3.kundenProfilAnzeigen();
*/
        Produkt p1 = new Produkt("Handschuhe", 18.99,1.2);

        Bestellung b_k1 = new Bestellung(1,k1);
        b_k1.produktHinzufuegen(p1);
        b_k1.rechnungsDrucken();
    }
}
