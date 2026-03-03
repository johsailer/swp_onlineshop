package swp_2aHWII.htlInn.oop.onlineshop.swp_onlineshop;

public class KundeMain {
    public static void main(String[] args) {
        Kunde k1 =  new Kunde("Hugostadt", "Hugonsen", "Hugo");
        k1.kundenProfilAnzeigen();
        Kunde k2 = new Kunde("Zirl", "Sailer", "Johann");
        k2.kundenProfilAnzeigen();
        Kunde k23 = new Kunde("Höttingen", "Einfinger", "Mario");
        k23.kundenProfilAnzeigen();
    }
}
