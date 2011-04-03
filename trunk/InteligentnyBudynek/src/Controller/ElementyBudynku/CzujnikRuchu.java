package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class CzujnikRuchu extends Urzadzenie {

	private double moc;
	private String nazwa;
	private boolean pracuje;
	private boolean ruch;
        private int idUrzadzenia;
        private int idPokoju;

        public CzujnikRuchu( int idPokoju){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = (new MsUrzadzenieDAO()).dodaj(this.idPokoju);

            this.nazwa = "Czujnik Ruchu";
            ( new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, this.nazwa);

            this.moc = 2;
            ( new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, this.moc);

            this.ruch = false;
        }

	public CzujnikRuchu(int idUrzadzenia, int idPokoju){
                this.idPokoju = idPokoju;
                this.idUrzadzenia = idUrzadzenia;
                this.nazwa = (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
                this.moc = ( new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
                this.ruch = false;
        }

        public boolean czyPracuje(int idUrzadzenia) {
                return (new MsUrzadzenieDAO()).czyPracuje(idUrzadzenia);
        }

        public boolean wlacz(){
            return (new MsUrzadzenieDAO()).rejestrujWlaczenie(this.idUrzadzenia);
	}

	public boolean wylacz(){
            return (new MsUrzadzenieDAO()).rejestrujWylaczenie(this.idUrzadzenia);
	}

        public double pobierzMoc() {
            return (new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
        }

        public boolean ustawMoc(double moc) {
            return (new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, moc);
        }


	public boolean czyJestRuch(){
		if ( this.ruch == true)
                    return true;
                else
                    return false;
	}

        public boolean getRuch(){
            return ruch;
        }

        public void setRuch(){
            this.ruch = true;
        }

	public boolean getPracuje(){
		return pracuje;
	}

         public void setPracuje(boolean pracuje){
            this.pracuje = pracuje;
        }

	public double getMoc(){
		return moc;
	}

        public void setMoc(double moc){
                this.moc = moc;
	}

	public String getNazwa(){
		return nazwa;
	}

       
	/**
	 *
	 * @param moc
	 */
	

	/**
	 *
	 * @param nazwa
	 */
	public void setNazwa(String nazwa){
                this.nazwa = nazwa;
	}

}