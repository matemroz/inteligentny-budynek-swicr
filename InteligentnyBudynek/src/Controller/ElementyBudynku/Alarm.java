package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class Alarm extends Urzadzenie {

    public Alarm(){}

    public Alarm(int idUrzadzenia, int idPokoju) {
        this.idUrzadzenia = idUrzadzenia;
        this.idPokoju = idPokoju;
    }

    public boolean czyPracuje(int idUrzadzenia) {
        this.pracuje = (new MsUrzadzenieDAO()).czyPracuje(idUrzadzenia);
    return this.pracuje;
    }

    public double pobierzMoc() {
        this.moc = (new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
    return this.moc;
    }

    public double ustawMoc(double moc) {
        this.moc = (new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, moc);
    return this.moc;
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
