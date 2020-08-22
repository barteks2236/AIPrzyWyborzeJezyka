![Logo](./src/main/resources/jarvis.jpg)

# AIPrzyWyborzeJezyka

### Bartosz Kozak & Sara Winiarek

####

* [Ogólne informacje](#Ogólne_informacje)
* [Technologia](#Technologia)
* [Ustawienia](#Ustawienia)

## Ogólne informacje
Ten projekt jest prostą aplikacją internetową, której celem jest zasugerowanie nauki odpowiedniego języka programowania przy pomocy sztucnej inteligencji. Do wyboru mamy dwa rodzaje AI, Pierwszym J.A.R.V.I.S. z którym komunikujemy się poprzez chat, a działa na zasadzie pracy neuronu. W jednym z pierwszych pytań JARVIS ustala zależnie od odpowiedzi czy jesteśmy któryś raz z kolei i czy jego poprzednie porady były satysfakcjonujące, jeśli nie, uczy się i zmienia wartość wag odpowiedzi w celu jak najlepszego doradzenia.
Drugim natomiast jest V.E.R.O.N.I.C.A. która działa na zasadzie drzewa decyzyjnego. VERONICA ma dużo większą ilość języków do programowania stąd, czasem może zdarzyć się tak że JARVIS, będzie odsyłał użytkownika do Niej, w celu otrzymania dokładniejszej porady.
	
## Technologia
Projekt jest stowrzony przy użyciu:
* java version: v1.8.0_251 
* Spring Boot:  v2.3.1.RELEASE

## Ustawienia
W celu uruchomienia projektu należy:

1. Zmienić hasło dostępu do bazy danych SQL w pliku "Connect" (/AIPrzyWyborzeJezyka/src/main/java/com/AI/AIPrzyWyborzeJezyka/Controller/Connect.java)
2. Posiadać utworzoną bazę o nazwie UsersDataAI w celu zapisywania swoich odpowiedzi przez JARVISa. Skrypt do bazy danych znajduje się w folderze Resources.
3. Uruchomić /AIPrzyWyborzeJezyka/src/main/java/com/AI/AIPrzyWyborzeJezyka/AiPrzyWyborzeJezykaApplication.java
4. Wejśc na localhost:8080/domowaAI i porozmawiać z AI


