package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class AnalizatorGazow extends Urzadzenie {

	private double moc;
	private String nazwa;
	private double poziomCO;
	private double poziomCO2;
	private boolean pracuje;
        private int idUrzadzenia;
        private int idPokoju;

        public AnalizatorGazow( int idPokoju){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = ( new MsUrzadzenieDAO()).dodaj(this.idPokoju);

            this.nazwa = "Analizator Gazów";
            (new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, this.nazwa);

            this.moc = 10;
            (new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, this.moc);
        }

	public AnalizatorGazow(int idUrzadzenia, int idPokoju){
            this.idUrzadzenia = idUrzadzenia;
            this.idPokoju = idPokoju;
            this.nazwa = (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
            this.moc = (new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
        }
/*Nie wiem czy o to chodziło ale w necie znalazłem że poziom CO powyżej
 * 26PPM( cząsteczek CO na milion cząsteczek tlenu) jest niebezpieczny
 */
         public boolean czyPracuje(int idUrzadzenia) {
                return (new MsUrzadzenieDAO()).czyPracuje(idUrzadzenia);
        }

        public double pobierzMoc() {
             return (new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
        }

        public boolean ustawMoc(double moc) {
                return(new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, moc);
        }

	public boolean wlacz(){
            return (new MsUrzadzenieDAO()).rejestrujWlaczenie(this.idUrzadzenia);
	}

	public boolean wylacz(){
            return ( new MsUrzadzenieDAO()).rejestrujWylaczenie(idUrzadzenia);
	}


	public boolean czyNiebezpiecznyCO(){
            if(poziomCO < 26)
                return false;
            else
                return true;
	}
/*Podobnie z CO2 ale tu potrzeba o wiele więcej*/

	public boolean czyNiebezpiecznyCO2(){
		if( poziomCO2 < 350)
                    return false;
                else
                    return true;
	}

	public double getMoc(){
		return moc;
	}

        public void setMoc(double moc){
                this.moc = moc;
	}

	public double getPoziomCO(){
		return poziomCO;
	}

	public double getPoziomCO2(){
		return poziomCO2;
	}

        public void setPoziomCO(double poziomCO){
                this.poziomCO = poziomCO;
	}

	public void setPoziomCO2(double poziomCO2){
                this.poziomCO2 = poziomCO2;
	}

        public boolean getPracuje(){
            return pracuje;
        }

        public void setPracuje( boolean pracuje){
            this.pracuje = pracuje;
        }
}