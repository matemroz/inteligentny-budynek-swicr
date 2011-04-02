package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class CzujnikTemperatury extends Urzadzenie {


	private double moc;
	private String nazwa;
	private boolean pracuje;
	private double temperatura;
        private int idUrzadzenia;
        private int idPokoju;

	public CzujnikTemperatury( int idUrzadzenia, int idPokoju){
                this.idUrzadzenia = idUrzadzenia;
                this.idPokoju = idPokoju;
	}

	public boolean getPracuje(){
		return pracuje;
	}

	public double getMoc(){
		return moc;
	}

	public String getNazwa(){
		return nazwa;
	}

	public double getTemperatura(){
		return temperatura;
	}

	/**
	 *
	 * @param moc
	 */
	public void setMoc(double moc){
                this.moc = moc;
	}

	/**
	 *
	 * @param nazwa
	 */
	public void setNazwa(String nazwa){
                this.nazwa = nazwa;
	}

	/**
	 *
	 * @param temperatura
	 */
	public void setTemperatura(double temperatura){
                this.temperatura = temperatura;
	}

        public void setPracuje( boolean pracuje){
            this.pracuje = pracuje;
        }

	public boolean wlacz(){
            return (new MsUrzadzenieDAO()).rejestrujWlaczenie(this.idUrzadzenia);
	}

	public boolean wylacz(){
            return (new MsUrzadzenieDAO()).rejestrujWylaczenie(this.idUrzadzenia);
	}

        public double pobierzMoc() {
                this.moc = (new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
            return this.moc;
        }

        public boolean czyPracuje(int idUrzadzenia) {
                this.pracuje = (new MsUrzadzenieDAO()).czyPracuje(idUrzadzenia);
            return this.pracuje;
        }

}