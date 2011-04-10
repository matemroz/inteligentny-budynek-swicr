package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class Okno extends Urzadzenie {

	private String nazwa;
	private boolean otwarte;
	private boolean zasloniete;
        private int idUrzadzenia;
        private int idPokoju;
        //TODO: czy w bazie rejestrujemy otwarcie i zasloniecie?
        
        public Okno(int idPokoju){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = (new MsUrzadzenieDAO()).dodaj(this.idPokoju);
            this.otwarte = false;
            this.zasloniete = false;
            this.nazwa = "Okno#"+this.idUrzadzenia;
            (new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, this.nazwa);
	}

	public Okno(int idPokoju, int idUrzadzenia){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = idUrzadzenia;
            this.otwarte = false;
            this.zasloniete = false;
            this.nazwa = (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
	}

        public Okno(int idPokoju, int idUrzadzenia, boolean otwarte, boolean zasloniete){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = idUrzadzenia;
            this.otwarte = otwarte;
            this.zasloniete = zasloniete;
            this.nazwa =  (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
	}

    @Override
        public int getIdPokoju(){
            return this.idPokoju;
        }

    @Override
        public int getIdUrzadzenia(){
            return this.idUrzadzenia;
        }

	public boolean czyOtwarte(){
            return this.otwarte;
	}

	public boolean czyZasloniete(){
            return this.zasloniete;
	}

    @Override
	public String getNazwa(){
            return this.nazwa;
	}

	public void odslon(){
            this.zasloniete = false;
	}

	public void otworz(){
            this.otwarte = true;
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

	public void zamknij(){
            this.otwarte = false;
	}

	public void zaslon(){
            this.zasloniete = true;
	}

}