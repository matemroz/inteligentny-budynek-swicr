package Controller.ElementyBudynku;

//Punkt grzewczy grzeje za pomoca GAZU

import Model.DAO.MsUrzadzenieDAO;


public class PunktGrzewczy extends Urzadzenie {

	private String nazwa;
	private int poziomDzialania;
	private boolean pracuje;
        private int idUrzadzenia;
        private int idPokoju;
        //TODO: jak obliczamy ile gazu zuzyto?

        public PunktGrzewczy(int idPokoju){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = (new MsUrzadzenieDAO()).dodaj(this.idPokoju);
            this.nazwa = "Punkt grzewczy#"+this.idUrzadzenia;
            (new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, this.nazwa);
            this.poziomDzialania = 0;//TODO: poziom dzialania
            this.pracuje = false;
	}

	public PunktGrzewczy(int idPokoju, int idUrzadzenia){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = idUrzadzenia;
            this.nazwa = (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
            this.poziomDzialania = 0;//TODO: poziom dzialania
            this.pracuje = false;
	}

        public PunktGrzewczy(int idPokoju, int idUrzadzenia, int poziomDzialania){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = idUrzadzenia;
            this.nazwa = (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
            this.poziomDzialania = poziomDzialania;//TODO: poziom dzialania
            this.pracuje = false;
	}

    @Override
        public int getIdPokoju(){
            return this.idPokoju;
        }

    @Override
        public int getIdUrzadzenia(){
            return this.idUrzadzenia;
        }

	public boolean czyPracuje(){
            return this.pracuje;
	}

    @Override
	public String getNazwa(){
            return this.nazwa;
	}

	public double getPoziomDzialania(){
            return this.poziomDzialania;
	}

    @Override
	public void setNazwa(String nazwa){
            boolean ifSuccess = (new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, nazwa);
            if (ifSuccess) {
                this.nazwa = nazwa;
            }
            else {
                System.out.println("Wystapił błąd podczas rejestrowania zmiany nazwy "
                        + this.nazwa + " w bazie danych. Zmiana nie została zarejestrowana!");
            }
	}

	public void setPoziomDzialania(int poziomDzialania){
            this.poziomDzialania = poziomDzialania;
            //TODO: obsluga bazy? czy przechowujemy poziomDzialania?
	}

	public void wlacz(){
            boolean ifSuccess = (new MsUrzadzenieDAO()).rejestrujWlaczenie(this.idUrzadzenia);
            if (ifSuccess) {
                this.pracuje = true;
            }
            else {
                System.out.println("Wystapił błąd podczas rejestrowania włączenia "
                        + this.nazwa + " w bazie danych. Włączenie nie zostało zarejestrowane!");
            }
	}

	public void wylacz(){
            boolean ifSuccess = (new MsUrzadzenieDAO()).rejestrujWlaczenie(this.idUrzadzenia);
            if (ifSuccess) {
                this.pracuje = true;
            }
            else {
                System.out.println("Wystapił błąd podczas rejestrowania wyłączenia "
                        + this.nazwa + " w bazie danych. Wyłączenie nie zostało zarejestrowane!");
            }
	}

}