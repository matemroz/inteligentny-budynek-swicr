package Controller.ElementyBudynku;

import Model.DAO.MsPietroDAO;
import Model.DAO.MsPokojDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pietro {
        private int idPietra;
	private List<Integer> pokoje;

        public Pietro(){}

        public Pietro(int idPietra){
            this.idPietra = idPietra;
            this.pokoje = (new MsPietroDAO()).wylistujPokoje(idPietra);
        }

        public int dodajPokoj(String nazwa, int idPietra){
            return (new MsPokojDAO()).dodajPokoj(nazwa, idPietra);
        }

        public int dodajPietro(String nazwa, int idBudynku){
            return (new MsPietroDAO()).dodaj(nazwa, idBudynku);
        }

        //zwrocna lista Pokoia
        public List<Pokoj> wylistujPokoje(){
            Iterator it = pokoje.iterator();
            List<Pokoj> pok = new ArrayList<Pokoj>();
            while(it.hasNext()){
               Pokoj p = new Pokoj((Integer)it.next(),idPietra);
               pok.add(p);
            }
            return pok;
        }

        public String pobierzNazwe(){
            String pokoj = (new MsPietroDAO()).pobierzNazwe(idPietra);
            return pokoj;
        }
}
