![Logo](./src/main/resources/jarvis.jpg)
#
# AI jako doradca przy wyborze języka programowania

### Bartosz Kozak & Sara Winiarek

####

* [Ogólne informacje](#Ogólne_informacje)
* [Technologia](#Technologia)
* [Ustawienia](#Ustawienia)

## Ogólne informacje
Ten projekt jest prostą aplikacją internetową, której celem jest zasugerowanie nauki odpowiedniego języka programowania przy pomocy sztucznej inteligencji. Do wyboru mamy dwa rodzaje AI. Pierwszym jest J.A.R.V.I.S., z którym komunikujemy się poprzez chat. Działa na zasadzie sieci neuronowej. JARVIS zależnie od odpowiedzi uczy się i zmienia propozycję wyboru danego języka w celu jak najlepszego doradzenia.
Drugim AI jest V.E.R.O.N.I.C.A., która działa na zasadzie drzewa decyzyjnego. Ma dużo większą liczbę języków do zaproponowania dlatego może zdarzyć się tak, że JARVIS będzie odsyłał użytkownika do niej, w celu otrzymania dokładniejszej porady.
	
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


