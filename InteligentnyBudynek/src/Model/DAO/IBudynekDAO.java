package Model.DAO;

import java.util.List;



public interface IBudynekDAO {

        int dodaj(String nazwa);

        boolean usun(int idBudynku);

	boolean ustawNazwe(int idBudynku, String nazwa);
	
	String pobierzNazwe(int idBudynku);
	
	List<Integer> pobierzListeBudynkow();

        List<Integer> pobierzListePieter(int idBudynku);
}
