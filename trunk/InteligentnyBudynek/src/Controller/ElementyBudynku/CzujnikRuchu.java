package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class CzujnikRuchu extends Urzadzenie {

	private double moc;
	private String nazwa;
	private boolean pracuje;
	private boolean ruch = false;
        private int idUrzadzenia;
        private int idPokoju;

	public CzujnikRuchu(int idUrzadzenia, int idPokoju){
                this.idPokoju = idPokoju;
                this.idUrzadzenia = idUrzadzenia;
	}

	public boolean czyJestRuch(){
		if ( ruch == true)
                    return true;
                else
                    return false;
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

        public void setPracuje(boolean pracuje){
            this.pracuje = pracuje;
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

        public void setRuch(){
            this.ruch = true;
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