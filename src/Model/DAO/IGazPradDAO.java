package Model.DAO;

public interface IGazPradDAO {

    double pobierzCenePradu();

    boolean ustawCenePradu(double cenaPradu);

    double pobierzCeneGazu();

    boolean ustawCeneGazu(double cenaGazu);
}
