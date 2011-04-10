
package Controller.Utils;

public class Konwerter {
    
    /*
     * Metoda jako argument przyjmuje czas w sekunach.
     * Zwraca String w postaci: HH:MM:SS
     */
    public static String czasSekNaGodz(int sek){
        if (sek < 0) {
            //TODO: obsluga ujemnej wartosci
        }
        if (sek > 86400){
            //TODO: obsluga powyzej 24h, czy potrzebna?
        }

        String hh,mm,ss;
        int hours = sek/(3600);
        int minutes = (sek - hours*3600)/60;
        int seconds = sek - hours*3600 - minutes*60;

        hh = ""+hours;
        mm = ""+minutes;
        ss = ""+seconds;

        if (hours < 10) {
            hh = "0"+hours;
        }
        if (minutes < 10) {
            mm = "0"+minutes;
        }
        if (seconds < 10) {
            ss = "0"+seconds;
        }

        return hh+":"+mm+":"+ss;
    }
/*  //metoda do testowania
    public static void main(String[] args) {
        System.out.println(czasSekNaGodz(41));
        System.out.println(czasSekNaGodz(60));
        System.out.println(czasSekNaGodz(62));
        System.out.println(czasSekNaGodz(162));
        System.out.println(czasSekNaGodz(6762));
        System.out.println(czasSekNaGodz(66641));
        System.out.println(czasSekNaGodz(99941));
    }
*/
}
