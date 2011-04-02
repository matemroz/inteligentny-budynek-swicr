package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class Gniazdko extends Urzadzenie {

	private double mocUrzadzenia;
	private String nazwa;
	//private boolean pracuje;
        private int idUrzadzenia;
        private int idPokoju;
        private boolean czyPodlaczone = false;

	public Gniazdko(int idUrzadzenia, int idPokoju){
                this.idUrzadzenia = idUrzadzenia;
                this.idPokoju = idPokoju;
	}

        public double ustawMocUrzadzenia(double moc){
             this.mocUrzadzenia = (new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, moc);
        return this.mocUrzadzenia;
        }

	public boolean czyPodlaczone(){
		return czyPodlaczone;
	}

	public double getMocUrzadzenia(){
		return mocUrzadzenia;
	}

	public String getNazwa(){
		return nazwa;
	}

	public void odlaczUrzadzenie(){
                this.czyPodlaczone = false;
	}

	public void podlaczUrzadzenie(){
                this.czyPodlaczone = true;
	}

	public boolean rejestrujOdlaczenie(){
                return (new MsUrzadzenieDAO()).rejestrujWylaczenie(this.idUrzadzenia);
	}

	public boolean rejestrujPodlaczenie(){
                return (new MsUrzadzenieDAO()).rejestrujWlaczenie(this.idUrzadzenia);
	}

	/**
	 *
	 * @param mocUrzadzenia
	 */
	public void setMocUrzadzenia(double mocUrzadzenia){
                this.mocUrzadzenia = mocUrzadzenia;
	}

	/**
	 *
	 * @param nazwa
	 */
	public void setNazwa(String nazwa){
                this.nazwa = nazwa;
	}

}