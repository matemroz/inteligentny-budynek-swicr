package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class Klimatyzator extends Urzadzenie {

	private double moc;
	private String nazwa;
	private int poziomDzialania;
	private boolean pracuje;
        private int idUrzadzenia;
        private int idPokoju;

	public Klimatyzator( int idUrzadzenia, int idPokoju){
                this.idUrzadzenia = idUrzadzenia;
                this.idPokoju = idPokoju;
	}

	public boolean czyPracuje(int idUrzadzenia){
		this.pracuje = (new MsUrzadzenieDAO()).czyPracuje(idUrzadzenia);
        return this.pracuje;
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

	public double getMoc(){
		return moc;
	}

	public String getNazwa(){
		return nazwa;
	}

	public int getPoziomDzialania(){
		return poziomDzialania;
	}

        public boolean getPracuje(){
            return pracuje;
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
	 * @param poziomDzialania
	 */
	public void setPoziomDzialania(int poziomDzialania){
                this.poziomDzialania = poziomDzialania;
	}

        public void setPracuje( boolean pracuje){
            this.pracuje = pracuje;
        }

}