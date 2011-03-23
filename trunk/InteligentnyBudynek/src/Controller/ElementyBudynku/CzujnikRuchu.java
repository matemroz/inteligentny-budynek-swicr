package Controller.ElementyBudynku;

public class CzujnikRuchu extends Urzadzenie {

	private double moc;
	private String nazwa;
	private boolean pracuje;
	private boolean ruch;
	public Alarm m_Alarm;

	public CzujnikRuchu(){

	}

	public boolean czyJestRuch(){
		return false;
	}

	public boolean czyPracuje(){
		return false;
	}

	public double getMoc(){
		return 0;
	}

	public String getNazwa(){
		return "";
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

	public void wlacz(){

	}

	public void wylacz(){

	}

}