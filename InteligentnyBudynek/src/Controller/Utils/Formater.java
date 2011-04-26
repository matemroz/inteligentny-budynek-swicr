package Controller.Utils;

public class Formater {

    public static String formatujID(int id, String nazwa) {
        String idMod = nazwa + "#" + id;
        return idMod;
    }

}
