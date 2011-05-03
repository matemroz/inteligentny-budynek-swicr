package Controller.ElementyBudynku;

import Model.DAO.MsDemoDAO;
import Model.DAO.MsUrzadzenieDAO;

public class Urzadzenie {

    private int idPokoju;
    private int idUrzadzenia;
    private String nazwa;

    public Urzadzenie() {
    }

    public Urzadzenie(int idUrzadzenia) {
        this.idUrzadzenia = idUrzadzenia;
    }

    public String pobierzNazwa() {
        return (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
    }

    public boolean ustawNazwa(String nazwa) {
        return (new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, nazwa);
    }

    public int dodaj(int idPokoju) {
        return (new MsUrzadzenieDAO()).dodaj(idPokoju);
    }

    public int przenies(int idPokoju) {
        return (new MsUrzadzenieDAO()).przenies(this.idUrzadzenia, idPokoju);
    }

    public boolean usun(int idUrzadzenia) {
        return (new MsUrzadzenieDAO()).usun(idUrzadzenia);
    }

    public double pobierzMocUrzadzenia() {
        return (new MsUrzadzenieDAO()).pobierzMoc(idUrzadzenia);
    }

    public double pobierzPoborGazuUrzadzenia() {
        return (new MsUrzadzenieDAO()).pobierzPoborGazu(idUrzadzenia);
    }

    public boolean ustawMocUrzadzenia(double mocUrzadzenia) {
        return (new MsUrzadzenieDAO()).ustawMoc(idUrzadzenia, mocUrzadzenia);
    }

    public boolean ustawPoborGazuUrzadzenia(double poborGazuUrzadzenia) {
        return (new MsUrzadzenieDAO()).ustawMoc(idUrzadzenia, poborGazuUrzadzenia);
    }

    public String pobierzNazwa(int idUrzadzenia) {
        return (new MsDemoDAO().pobierzNazwa(idUrzadzenia));
    }

    public void wlacz() {
        new MsUrzadzenieDAO().rejestrujWlaczenie(this.idUrzadzenia);
    }

    public void wylacz() {
        new MsUrzadzenieDAO().rejestrujWylaczenie(idUrzadzenia);
    }

    public boolean czyPracuje() {
        return new MsUrzadzenieDAO().czyPracuje(this.idUrzadzenia);
    }

    /*
     * Metody wygenerowane na podstawie pól
     */
    public int getIdUrzadzenia() {
        return this.idUrzadzenia;
    }

    public void setIdUrzadzenia(int idUrzadzenia) {
        this.idUrzadzenia = idUrzadzenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIdPokoju() {
        return idPokoju;
    }

    public void setIdPokoju(int idPokoju) {
        this.idPokoju = idPokoju;
    }

    public void ustawPoziomPracy(int poziomPracy) {
        (new MsUrzadzenieDAO()).ustawPoziomPracy(this.idUrzadzenia, poziomPracy);
    }

    public int pobierzPoziomPracy() {
        return (new MsUrzadzenieDAO()).pobierzPoziomPracy(this.idUrzadzenia);
    }

    @Override
    public String toString() {
        String string = this.nazwa + "#" + this.idUrzadzenia;
        return string;
    }

    public int dodaj(int idPokoju, String string) {
        return (new MsUrzadzenieDAO()).dodaj(idPokoju, nazwa);
    }
}
