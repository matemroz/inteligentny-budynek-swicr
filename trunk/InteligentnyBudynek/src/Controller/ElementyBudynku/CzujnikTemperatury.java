package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class CzujnikTemperatury extends Urzadzenie {

    private double moc;
    private String nazwa;
    private boolean pracuje;
    private double temperatura;
    private int idUrzadzenia;
    private int idPokoju;

    public CzujnikTemperatury(int idPokoju) {
        this.idPokoju = idPokoju;
        this.idUrzadzenia = (new MsUrzadzenieDAO()).dodaj(this.idPokoju);

        this.nazwa = "Czujnik temperatury";
        (new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, this.nazwa);

        this.moc = 2;
        (new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, this.moc);
        this.pracuje = false;
    }

    public CzujnikTemperatury(int idUrzadzenia, int idPokoju) {
        this.idUrzadzenia = idUrzadzenia;
        this.idPokoju = idPokoju;
        this.nazwa = (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
        this.moc = (new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
        this.pracuje = false;
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


    @Override
    public void wlacz() {
        new MsUrzadzenieDAO().rejestrujWlaczenie(this.idUrzadzenia);
    }

    @Override
    public void wylacz() {
        new MsUrzadzenieDAO().rejestrujWylaczenie(this.idUrzadzenia);
    }

    public boolean getPracuje() {
        return pracuje;
    }

    public void setPracuje(boolean pracuje) {
        this.pracuje = pracuje;
    }

    public double getMoc() {
        return moc;
    }

    public void setMoc(double moc) {
        this.moc = moc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public int getIdUrzadzenia() {
        return idUrzadzenia;
    }
}
