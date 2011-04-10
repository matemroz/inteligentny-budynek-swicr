package Controller.Utils;

public class Formater {
    public static String formatujIDUrzadzenia(int id, String nazwaUrzadzenia){
        String idUrzadzenia =  nazwaUrzadzenia + "#" + id;
        return idUrzadzenia;
    }
}
