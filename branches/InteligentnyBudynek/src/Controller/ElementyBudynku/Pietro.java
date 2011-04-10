package Controller.ElementyBudynku;

import Model.DAO.MsPietroDAO;
import java.util.List;

public class Pietro {
        private int idPietra;
	private List<Integer> pokoje;

        public Pietro(){
            this.pokoje = (new MsPietroDAO()).wylistujPokoje();
        }

        //zwrocne idPokojow
        public List<Integer> wylistujPokoje(){
            return pokoje;
        }
}
