package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class Drzwi extends Urzadzenie {

    private String nazwa;
    private boolean otwarte;
    private int idUrzadzenia;
    private int idPokoju;

    public Drzwi(int idPokoju) {
        this.idPokoju = idPokoju;
        this.idUrzadzenia = (new MsUrzadzenieDAO()).dodaj(this.idPokoju);

        this.nazwa = "Drzwi#" + this.idUrzadzenia;
        (new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, this.nazwa);
        this.otwarte = false;
    }

    public Drzwi(int idUrzadzenia, int idPokoju) {
        this.idUrzadzenia = idUrzadzenia;
        this.idPokoju = idPokoju;
        this.nazwa = (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
        this.otwarte = false;
    }


    public void wlacz() {
        new MsUrzadzenieDAO().rejestrujWlaczenie(this.idUrzadzenia);
    }

    public void wylacz() {
        new MsUrzadzenieDAO().rejestrujWylaczenie(this.idUrzadzenia);
    }

    public boolean czyOtwarte() {
        if (this.otwarte == true) {
            return true;
        } else {
            return false;
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void otworz() {
        this.otwarte = true;
    }

    public void zamknij() {
        this.otwarte = false;
    }

    @Override
    public int getIdUrzadzenia() {
        return idUrzadzenia;
    }
}
