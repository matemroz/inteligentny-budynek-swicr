package Controller.ElementyBudynku;

import Model.DAO.MsGazPradDAO;

public class Gaz {

	public double cenaZaMetr;

	public Gaz(){

        }

	public double getCenaZaMetr(){
		return cenaZaMetr;
	}

	/**
	 *
	 * @param cenaZaMetr
	 */
	public void setCenaZaMetr(double cenaZaMetr){
                this.cenaZaMetr = cenaZaMetr;
	}

        public double pobierzCeneZaMetr() {
                this.cenaZaMetr = (new MsGazPradDAO()).pobierzCeneGazu();
            return this.cenaZaMetr;
        }

        public double ustawCeneZaMetr(double cenaZaMetr) {
                this.cenaZaMetr = (new MsGazPradDAO()).ustawCeneGazu(cenaZaMetr);
            return this.cenaZaMetr;
        }


}