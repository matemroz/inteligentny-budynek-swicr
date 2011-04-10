package Model.DAO;

public abstract class DAOFactory {
    public abstract IUrzadzenieDAO getUrzadzenieDAO();
    public abstract IPokojDAO getPokojDAO();
    public abstract IGazPradDAO getGazPradDAO();
}
