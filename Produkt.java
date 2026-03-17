package swp_2aHWII.htlInn.oop.onlineshop.swp_onlineshop;

public class Produkt {
    private String produktname;
    private double nettopreis;
    private double steuerFaktor;

    public Produkt(String produktname, double nettopreis, double steuerFaktor){
        this.produktname = produktname;
        this.steuerFaktor = steuerFaktor;
        this.nettopreis = nettopreis;
    }

    public double getBruttoPreis(){
        double bruttoPreis = nettopreis * steuerFaktor;
        return bruttoPreis;
    }
    public double getNettopreisPreis(){
        return nettopreis;
    }
    public double getSteuerFaktor(){
        return steuerFaktor;
    }



}
