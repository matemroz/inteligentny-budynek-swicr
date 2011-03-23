package Controller.ElementyBudynku;

public class Klimatyzator extends Urzadzenie {

	private double moc;
	private String nazwa;
	private int poziomDzialania;
	private boolean pracuje;
	public CzujnikTemperatury m_CzujnikTemperatury;

	public Klimatyzator(){

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

	public int getPoziomDzialania(){
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
	 * @param poziomDzialania
	 */
	public void setPoziomDzialania(int poziomDzialania){

	}

	public void wlacz(){

	}

	public void wylacz(){

	}

}