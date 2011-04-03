package Controller.ElementyBudynku;

import Model.DAO.MsGazPradDAO;

public class Gaz {

	public double cenaZaMetr;

	public Gaz(){
            this.cenaZaMetr = ( new MsGazPradDAO()).pobierzCeneGazu();
        }

	public double getCenaZaMetr(){
		return this.cenaZaMetr;
	}

	/**
	 *
	 * @param cenaZaMetr
	 */
	public void setCenaZaMetr(double cenaZaMetr){
                this.cenaZaMetr = cenaZaMetr;
	}

        public boolean ustawCeneZaMetr(double cenaZaMetr) {
            //TODO: nie wiem jak to inaczej rozwiazać
            (new MsGazPradDAO()).ustawCeneGazu(cenaZaMetr);
        return true;
        }

}