package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class Urzadzenie {

    private int idPokoju;
    private int idUrzadzenia;
    private String nazwa;

    public Urzadzenie() {
    }

    public String pobierzNazwa() {
        this.nazwa = (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
    return this.nazwa;
    }

    public String ustawNazwa(String nazwa) {
        this.nazwa = (new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, nazwa);
    return this.nazwa;
    }

    public int dodaj(int idPokoju) {
        this.idUrzadzenia = (new MsUrzadzenieDAO()).dodaj(idPokoju);
    return this.idUrzadzenia;
    }

    public int przenies(int idPokoju) {
        this.idPokoju = (new MsUrzadzenieDAO()).przenies(this.idUrzadzenia, idPokoju);
    return this.idPokoju;
    }

    public boolean usun(int idUrzadzenia) {
        return (new MsUrzadzenieDAO()).usun(idUrzadzenia);
    }
    
    public int getIdUrzadzenia() {
        return this.idUrzadzenia;
    }

    /*
     * Metody wygenerowane na podstawie pól
     */

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
}
