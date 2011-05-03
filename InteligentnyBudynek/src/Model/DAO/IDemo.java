/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.DAO;

import Controller.ElementyBudynku.Urzadzenie;
import java.util.List;

/**
 *
 * @author Rafał
 */
public interface IDemo {

    List<Urzadzenie> wylistujUrzadzenia(int idPokoju);

     double pobierzMoc(int idUrzadzenia);

    double pobierzPoborGazu(int idUrzadzenia);

    int pobierzCzasPracy(int idUrzadzenia);

    String pobierzPoczatekPracy( int idUrzadzenia);

    String pobierzKoniecPracy( int idUrzadzenia);

    String pobierzNazwa(int idUrzadzenia);
}
