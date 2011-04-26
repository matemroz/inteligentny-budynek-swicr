package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class ZraszaczPrzeciwpozarowy extends Urzadzenie {

	private double moc;
	private String nazwa;
	private boolean pracuje;
        private int idUrzadzenia;
        private int idPokoju;

        public ZraszaczPrzeciwpozarowy(int idPokoju){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = (new MsUrzadzenieDAO()).dodaj(this.idPokoju);
            this.moc = 30;
            (new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, moc);
            this.nazwa = "Zraszacz przeciwpożarowy";
            (new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, nazwa);
            this.pracuje = false;
	}

	public ZraszaczPrzeciwpozarowy(int idPokoju,int idUrzadzenia){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = idUrzadzenia;
            this.moc = (new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
            this.nazwa = (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
            this.pracuje = false;
	}

        public ZraszaczPrzeciwpozarowy(int idPokoju,int idUrzadzenia, double moc){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = idUrzadzenia;
            this.moc = moc;
            (new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, moc);
            this.nazwa = (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
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

	public double getMoc(){
            return this.moc;
	}

    @Override
	public String getNazwa(){
            return this.nazwa;
	}

	public boolean setMoc(double moc){
            if ( moc < 0 ) {
                System.out.println("Podano ujemną moc urządzenia!");
                return false;
            }

            boolean ifSuccess = (new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, moc);
            if (ifSuccess) {
                this.moc = moc;
                return true;
            }
            else {
                System.out.println("Wystapił błąd podczas rejestrowania zmiany mocy "
                        + this.nazwa + " w bazie danych. Zmiana nie została zarejestrowana!");
            }
            return false;
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