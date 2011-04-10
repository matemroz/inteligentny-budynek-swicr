package Controller.ElementyBudynku;

import Model.DAO.MsGazPradDAO;

public class Prad {

	public double cenaKWH;

	public Prad(){
            cenaKWH = (new MsGazPradDAO()).pobierzCenePradu();
	}

	public double getCenaKWH(){
            return this.cenaKWH;
	}

	
	public boolean setCenaKWH(double cenaKWH){
            //TODO: co jesli nie uda sie zmienic ceny w bazie?
            if (cenaKWH < 0){
                System.out.println("Nie można ustawić ujemnej ceny za prąd!");
                return false;
            }
            
            this.cenaKWH = cenaKWH;
            (new MsGazPradDAO()).ustawCenePradu(cenaKWH);
            return true;
	}

}