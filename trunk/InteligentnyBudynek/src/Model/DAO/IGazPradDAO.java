package Model.DAO;

public interface IGazPradDAO {

    double pobierzCenePradu();

    boolean ustawCenePradu(double cenaPradu);

    double pobierzCeneGazu();

    double ustawCeneGazu(double cenaGazu);
}
