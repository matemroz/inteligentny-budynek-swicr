package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class Drzwi extends Urzadzenie {

	private String nazwa;
	private boolean otwarte;
        private int idUrzadzenia;
        private int idPokoju;

	public Drzwi( int idUrzadzenia, int idPokoju){
                this.idUrzadzenia = idUrzadzenia;
                this.idPokoju = idPokoju;
	}

	public boolean czyOtwarte(){
		return otwarte;
	}

	public String getNazwa(){
		return nazwa;
	}

	public void otworz(){
                this.otwarte = true;
	}

	/**
	 *
	 * @param nazwa
	 */
	public void setNazwa(String nazwa){

	}

	public void zamknij(){
            this.otwarte = false;
	}

        public boolean wlacz() {
            return (new MsUrzadzenieDAO()).rejestrujWlaczenie(this.idUrzadzenia);
        }

        public boolean wylacz() {
            return (new MsUrzadzenieDAO()).rejestrujWylaczenie(this.idUrzadzenia);
        }

}