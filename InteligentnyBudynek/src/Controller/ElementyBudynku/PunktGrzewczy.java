package Controller.ElementyBudynku;

public class PunktGrzewczy extends Urzadzenie {

	private String nazwa;
	private int poziomDzialania;
	private boolean pracuje;
	public CzujnikTemperatury m_CzujnikTemperatury;

	public PunktGrzewczy(){

	}

	public boolean czyPracuje(){
		return false;
	}

	public String getNazwa(){
		return "";
	}

	public double getPoziomDzialania(){
		return 0;
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
	public void setPoziomDzialania(double poziomDzialania){

	}

	public void wlacz(){

	}

	public void wylacz(){

	}

}