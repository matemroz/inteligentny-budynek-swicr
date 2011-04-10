package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class Alarm extends Urzadzenie {


    public Alarm(int idPokoju){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = (new MsUrzadzenieDAO()).dodaj(this.idPokoju);

            this.nazwa = "Alarm";
            (new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, this.nazwa);

            this.moc = 30;
            (new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, this.moc);
    }

    public Alarm(int idPokoju, int idUrzadzenia){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = idUrzadzenia;
            this.nazwa = (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
            this.moc = (new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
    }

    public boolean czyPracuje(int idUrzadzenia) {
        return (new MsUrzadzenieDAO()).czyPracuje(idUrzadzenia);
    }

    public double pobierzMoc() {
         return (new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
    }

    public boolean ustawMoc(double moc) {
        return (new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, moc);
    }

    public boolean wlacz() {
        return (new MsUrzadzenieDAO()).rejestrujWlaczenie(this.idUrzadzenia);
    }

    public boolean wylacz() {
        return (new MsUrzadzenieDAO()).rejestrujWylaczenie(this.idUrzadzenia);
    }

    public double getMoc() {
        return moc;
    }

    public void setMoc(double moc) {
        this.moc = moc;
    }

    public boolean isPracuje() {
        return pracuje;
    }

    public void setPracuje(boolean pracuje) {
        this.pracuje = pracuje;
    }

    private double moc;
    private String nazwa;
    private boolean pracuje;
    private int idUrzadzenia;
    private int idPokoju;
}
