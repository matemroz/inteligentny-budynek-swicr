package Controller.ElementyBudynku;

import Model.DAO.MsUrzadzenieDAO;

public class Gniazdko extends Urzadzenie {

	private double mocUrzadzenia;
	private String nazwa;
        private int idUrzadzenia;
        private int idPokoju;
        private boolean czyPodlaczone;

        public Gniazdko( int idPokoju){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = ( new MsUrzadzenieDAO()).dodaj(this.idPokoju);

            this.mocUrzadzenia = 500;
            ( new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, this.mocUrzadzenia);

            this.nazwa = "Gniazdko";
            ( new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, this.nazwa);

            this.czyPodlaczone = false;
        }

	public Gniazdko(int idUrzadzenia, int idPokoju){
                this.idUrzadzenia = idUrzadzenia;
                this.idPokoju = idPokoju;
                this.nazwa = ( new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
                this.mocUrzadzenia = ( new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
                this.czyPodlaczone = false;
        }

        public boolean ustawMocUrzadzenia(double moc){
            return (new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, moc);
        
        }

        public double pobierzMoc() {
            return (new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
        }

        public boolean rejestrujOdlaczenie(){
                return (new MsUrzadzenieDAO()).rejestrujWylaczenie(this.idUrzadzenia);
	}

	public boolean rejestrujPodlaczenie(){
                return (new MsUrzadzenieDAO()).rejestrujWlaczenie(this.idUrzadzenia);
	}

	public boolean getPodlaczone(){
		return czyPodlaczone;
	}

        public void odlaczUrzadzenie(){
                this.czyPodlaczone = false;
	}

	public void podlaczUrzadzenie(){
                this.czyPodlaczone = true;
	}

	public double getMocUrzadzenia(){
		return mocUrzadzenia;
	}

        public void setMocUrzadzenia(double mocUrzadzenia){
                this.mocUrzadzenia = mocUrzadzenia;
	}

	public String getNazwa(){
		return nazwa;
	}

        public void setNazwa(String nazwa){
                this.nazwa = nazwa;
	}

	
	
}
