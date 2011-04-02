package Controller.ElementyBudynku;

import Model.DAO.MsGazPradDAO;

public class Prad {

	public double cenaKWH;

	public Prad(){
            //TODO: co jesli nie uda sie pobrac ceny?
            cenaKWH = (new MsGazPradDAO()).pobierzCenePradu();
	}

	public double getCenaKWH(){
            return this.cenaKWH;
	}

	
	public boolean setCenaKWH(double cenaKWH){
            //TODO: co jesli nie uda sie zmienic ceny w bazie?
            if (cenaKWH < 0)
                return false;

            this.cenaKWH = cenaKWH;
            (new MsGazPradDAO()).ustawCenePradu(cenaKWH);
            return true;
	}

}