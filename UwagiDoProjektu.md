# Uwagi do projektu #


---


## Format nazwy urządzenia ##
Nazwa urządzanie składa się z _**"Nazwa\_urządzenia#"+idUrzadzenia**_ np. Żarówka#101


---


## Konstruktory Elementy Budynku ##
W konstruktorach następuje inicjalizacja pól. Do inicjalizacji niektórych pól wykorzystywane są metody z interfejsu do obsługi bazy, np. (_nazwa_, _moc_ ),

Potrzebujemy tutaj również co najmniej dwa rodzaje konstruktorów:
  * _urządzenie zostało utworzone już wcześniej_ -
```
...

    public Alarm(int idPokoju, int idUrzadzenia){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = idUrzadzenia;
            this.nazwa = (new MsUrzadzenieDAO()).pobierzNazwa(this.idUrzadzenia);
            this.moc = (new MsUrzadzenieDAO()).pobierzMoc(this.idUrzadzenia);
    }
...
```

  * _tworzone jest nowe urządzenie_ :

```
...

    public Alarm(int idPokoju){
            this.idPokoju = idPokoju;
            this.idUrzadzenia = (new MsUrzadzenieDAO()).dodaj(this.idPokoju);

            this.nazwa = "Alarm";
            (new MsUrzadzenieDAO()).ustawNazwa(this.idUrzadzenia, this.nazwa);

            this.moc = 30;
            (new MsUrzadzenieDAO()).ustawMoc(this.idUrzadzenia, this.moc);
    }

...
```



---


## Load programu ##
W trakcie ładowania GUI i wykonywania metody onLoad (chyba tak się nazywała, ale nie jestem pewien) powinny być wykonywane następujące akce:

  1. Pobranie listy pokoi.
  1. Pobranie list urzadzeń do każdego pokoju.
  1. Utworzenie obiektów urządzeń w każdym pokoju.




---


## Metody z bazy ##
Metody z bazy pobierz i ustaw **nie zmieniają stanu** pól obiektów. Zwracają tylko wartość:
  * ustaw->boolean,
  * pobierz-> odpowiedni typ (np. double dla moc).



---


## Poziom gazów i pracy klimatyzatora ##
To jest jeszcze do rozkminienia. Dobrze byłoby jakby z poziomu GUI wyglądało to w ten sposób, że mamy ComboBoxa i wartości do wyboru: 0, 20, 40, 60, 80, 100%.



---


## Format czasu pracy ##
Metoda _pobierzCzasPracy_ będzie pobierać czas danych w sekundach. W programie możemy zrobić np. wyświetlanie czasu pracy przeliczając te sekundy na format: HH:MM:SS. Zrobiłem w paczce: Controller.Utils klasę _Konwerter_. Będziemy w niej pisać metody do konwersji jednostek itp.