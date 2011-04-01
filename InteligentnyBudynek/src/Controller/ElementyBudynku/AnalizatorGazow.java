package Controller.ElementyBudynku;

public class AnalizatorGazow extends Urzadzenie {

	private double moc;
	private String nazwa;
	private double poziomCO;
	private double poziomCO2;
	private boolean pracuje;

	public AnalizatorGazow(){

	}

	public boolean czyNiebezpiecznyCO(){
		return false;
	}

	public boolean czyNiebezpiecznyCO2(){
		return false;
	}

	public double getMoc(){
		return 0;
	}

	public double getPoziomCO(){
		return 0;
	}

	public double getPoziomCO2(){
		return 0;
	}

	public void setMoc(double moc){

	}

        public void setPoziomCO(double poziomCO){

	}

	public void setPoziomCO2(double poziomCO2){

	}

	public void wlacz(){

	}

	public void wylacz(){

	}

}