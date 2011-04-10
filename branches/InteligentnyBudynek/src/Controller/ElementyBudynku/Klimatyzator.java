package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class Klimatyzator extends Urzadzenie {

    /*Trzeba będzie jeszcze przemyśleć bo jak wyższy poziom działania to większa moc pobierana*/

	private double moc;
	private String nazwa;
	private int poziomDzialania;
	private boolean pracuje;
        private int idUrzadzenia;
        private int idPokoju;

        public Klimatyzator(int idPokoju){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = (new MsUrzadzenieDAO()).dodaj(this.idPokoju);

            this.nazwa = "Klimatyzator#" + this.idUrzadzenia;
            (new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, this.nazwa);

            this.moc = 300;
            (new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, this.moc);
            this.pracuje = false;
        }

	public Klimatyzator( int idUrzadzenia, int idPokoju){
                this.idUrzadzenia = idUrzadzenia;
                this.idPokoju = idPokoju;
                this.nazwa = (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
                this.moc = (new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
                this.pracuje = false;
        }

	public boolean czyPracuje(int idUrzadzenia){
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

	public double getMoc(){
		return moc;
	}

        public void setMoc(double moc){
                this.moc = moc;
	}

	public String getNazwa(){
		return nazwa;
	}

        public void setNazwa(String nazwa){
                this.nazwa = nazwa;
	}

	public int getPoziomDzialania(){
		return poziomDzialania;
	}

	public void setPoziomDzialania(int poziomDzialania){
                this.poziomDzialania = poziomDzialania;
	}
        public boolean getPracuje(){
            return pracuje;
        }
	
        public void setPracuje( boolean pracuje){
            this.pracuje = pracuje;
        }

}
