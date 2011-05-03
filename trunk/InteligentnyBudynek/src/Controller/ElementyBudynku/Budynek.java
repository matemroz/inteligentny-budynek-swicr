package Controller.ElementyBudynku;

import Model.DAO.MsBudynekDAO;
import Model.DAO.MsPokojDAO;
import java.util.List;
import java.util.ArrayList;

public class Budynek {

    private int idBudynku;
    private String nazwa;
    private List<Integer> budynki;

    public Budynek() {
        budynki = (new MsBudynekDAO()).pobierzListeBudynkow();
    }

    public Budynek(int idBudynku) {
        this.idBudynku = idBudynku;
        this.nazwa = (new MsBudynekDAO()).pobierzNazwe(idBudynku);
        this.budynki = (new MsBudynekDAO()).pobierzListeBudynkow();
    }

    public Budynek(int idBudynku, String nazwa) {
        this.idBudynku = idBudynku;
        this.nazwa = nazwa;
        (new MsPokojDAO()).ustawNazwe(this.idBudynku, nazwa);
    }

    public int getIdBudynku() {
        return this.idBudynku;
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public String pobierzNazwa(int idBudynku) {
        return (new MsBudynekDAO()).pobierzNazwe(idBudynku);
    }

    public void ustawNazwa(int idBudynku, String nazwa) {
        (new MsBudynekDAO()).ustawNazwe(idBudynku, nazwa);
        this.nazwa = nazwa;
    }

    public List<Integer> pobierzListeBudynkow() {
        return (new MsBudynekDAO()).pobierzListeBudynkow();
    }

    public List<Integer> pobierzListePieter(int idBudynku){
        return (new MsBudynekDAO()).pobierzListePieter(idBudynku);
    }

    public boolean dodajBudynek(String nazwa) {
        int id = (new MsBudynekDAO()).dodaj(nazwa);
        //boolean b = budynki.add(id);
        return true;
    }

    public boolean usunBudynek(int b) {
        return this.budynki.remove((Object) b);
    }

    public static void main(String[] args){
        (new Budynek()).dodajBudynek("sda");
    }
}
