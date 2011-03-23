package Controller.ElementyBudynku;

public class AnalizatorGazow extends Urzadzenie {

	private double moc;
	private String nazwa;
	private double poziomCO;
	private double poziomCO2;
	private boolean pracuje;
	public Alarm m_Alarm;
	public ZraszaczPrzeciwpozarowy m_ZraszaczPrzeciwpozarowy;

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

	public String getNazwa(){
		return "";
	}

	public double getPoziomCO(){
		return 0;
	}

	public double getPoziomCO2(){
		return 0;
	}

	/**
	 * 
	 * @param moc
	 */
	public void setMoc(double moc){

	}

	/**
	 * 
	 * @param nazwa
	 */
	public void setNazwa(String nazwa){

	}

	/**
	 * 
	 * @param poziomCO
	 */
	public void setPoziomCO(double poziomCO){

	}

	/**
	 * 
	 * @param poziomCO2
	 */
	public void setPoziomCO2(double poziomCO2){

	}

	public void wlacz(){

	}

	public void wylacz(){

	}

}