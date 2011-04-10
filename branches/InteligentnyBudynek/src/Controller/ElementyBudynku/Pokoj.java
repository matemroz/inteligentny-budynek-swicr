package Controller.ElementyBudynku;

import Model.DAO.MsPokojDAO;
import java.util.List;

public class Pokoj {

	private int idPokoju;
	private String nazwa;
	private List Urzadzenia;

	public Pokoj(int idPokoju){
            this.idPokoju = idPokoju;
            this.nazwa = (new MsPokojDAO()).pobierzNazwa(this.idPokoju);
            this.Urzadzenia = (new MsPokojDAO()).wylistujUrzadzenia(this.idPokoju);
	}

        public Pokoj(int idPokoju, String nazwa){
            this.idPokoju = idPokoju;
            this.nazwa = nazwa;
            (new MsPokojDAO()).ustawNazwe(this.idPokoju, nazwa);
	}


	public int getIdPokoju(){
            return this.idPokoju;
	}

	public String getNazwa(){
            return this.nazwa;
	}

	public void setNazwa(String nazwa){
            (new MsPokojDAO()).ustawNazwe(this.idPokoju, nazwa);
            this.nazwa = nazwa;

            /* //TODO: ustawNazwa powinna zwracac boolean
               boolean ifSuccess = (new MsPokojDAO()).ustawNazwa(this.idPokoju, nazwa);
            if (ifSuccess) {
                this.nazwa = nazwa;
            }
            else {
                System.out.println("Wystapił błąd podczas rejestrowania zmiany nazwy "
                        + this.nazwa + " w bazie danych. Zmiana nie została zarejestrowana!");
            }
             */
	}

        //Zwraca listę idUrzadzen z pokoju
	public List wylistujUrzadzenia(){
            return Urzadzenia;
	}

        public boolean dodajUrzadzenie(Urzadzenie u){
            return this.Urzadzenia.add(u);
        }

        public boolean usunUrzadzenie(Urzadzenie u){
            return this.Urzadzenia.remove(u);
        }

}