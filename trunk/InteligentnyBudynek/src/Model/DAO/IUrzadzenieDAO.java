package Model.DAO;

 public interface IUrzadzenieDAO {

    //zwraca z bazy idPokoju, w ktorym jest urzadzenie o danym idUrzadzenia
     int znajdzUrzadzenie(int idUrzadzenia);

    //dodaje do bazy urzadzenie do danego pokoju (idUrzadzenia generowane jest automatycznie w bazie)
     boolean dodaj(int idPokoju);

    //zmienia w bazie idPokoju do dla urzadzenia o danym idUrzadzenia
     boolean przenies(int idUrzadzenia, int idPokoju);

    //usuwa z bazy urzadzenie o danym idUrzadzenia
     boolean usun(int idUrzadzenia) ;

    //pobiera z bazy moc urzadzenia
     double getMoc(int idUrzadzenia);

    //wprowadza w bazie moc urzadzenia
     boolean ustawMoc(int idUrzadzenia, double moc);

     double getPoborGazu(int idUrzadzenia);

     boolean ustawPoborGazu(int idUrzadzenia, double poborGazu) ;

    //rejestracja w bazie momentu wlaczenia urzadzenia
    boolean rejestrujWlaczenie(int idUrzadzenia);

   //rejestracja w bazie momentu odlaczenia urzadzenia
    boolean rejestrujWylaczenie(int idUrzadzenia);

   //pobranie z bazu czasu pracy urzadzenia
    int pobierzCzasPracy(int idUrzadzenia);
}
