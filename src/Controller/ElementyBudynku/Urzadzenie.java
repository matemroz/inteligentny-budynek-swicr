package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class Urzadzenie {

    private int idPokoju;
    private int idUrzadzenia;
    private String nazwa;

    public Urzadzenie() {
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
    @Override
    public String toString(){
        String string = this.nazwa + "#" + this.idUrzadzenia;

        return string;
    }
}
