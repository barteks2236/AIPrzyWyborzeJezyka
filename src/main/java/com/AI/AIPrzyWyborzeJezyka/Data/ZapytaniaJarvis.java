package com.AI.AIPrzyWyborzeJezyka.Data;

import java.util.ArrayList;
import java.util.List;

import com.AI.AIPrzyWyborzeJezyka.Controller.DomowaController;

public class ZapytaniaJarvis {
	
	
	
	public static String y; // Pytanie do odpowiedzi x
	public static List<String> danePytan = new ArrayList<String>();
//	public static List<ZapytaniaJarvis> danePytan = new ArrayList<ZapytaniaJarvis>();
	public String pyt = danePytan.get(0);
	public static void stworzenieBazyPytan() {
		
		
		
/*1*/		danePytan.add(", Fajne imię, miło mi Cię poznać, ja jestem Java Artificial Rare Virtual Inteligent System, ale mów mi J.A.R.V.I.S.\n"
						+ " Jesteś tutaj bo szukasz odpowiedniego języka programowania do nauki, tak czy nie? Jeśli nie to przeniosę Cię na strone główną :P ");

/*2*/		danePytan.add(", w takim razie świetnie trafiłeś, postaram Ci się pomóc ale żebym mógł to zrobić najlepiej jak potrafię to musisz mi odpowiedzieć na kilka ważnych pytań, ok? "
		+ "Bo jeśli nie, to oddeleguje Cię na strone główną, jestem zapracowanym AI :P");
/*3*/		danePytan.add(", czy wiesz może w jakim celu chcesz uczyć się programować? Chcesz pracować jako PROGRAMISTA czy może otworzyć jakiś swój BIZNES, może STARTUP? A może chcesz po prostu zrobić coś FAJNEGO "
				+ "lub nauczyć się czegoś NOWEGO? Odpowiedz jednym słowem proszę, wciąż uczę się waszego języka :) ");
/*4*/		danePytan.add(", czy kiedykolwiek pojawiła się jakaś styczność z programowaniem inaczej niż jako użytkownik? ");
/*5*/		danePytan.add(", jest może jakiś konkretny kierunek który Cię interesuje? Gry, Web, Mobile, Desktop software, a może Analiza danych? Odpowiedz jednym słowem ;) ");
/*6*/		danePytan.add(", PC czy Mobile? Na które urządzenia chesz pisać programy? ");
/*7*/		danePytan.add(", wolisz grafikę 2D czy 3D? ");
/*8*/		danePytan.add(", front-end skupia się na tym co widzi użytkownik, a back-end na całej mechanice działania programu, co bardziej Cię interesuje? ");
/*9*/		danePytan.add(", Windows, MacOs czy może Android? Na jaką platformę chcesz pisać swoje programy? ");
/*10*/		


/*KONIEC*/	danePytan.add(", Jesli widzisz ten tekst to skonczyły mi się pytania, loading... ");		// ten tekst ma się NIE WYSWIETLAC, dodatkowa wartośc tabeli zeby zakonczyc, nie kasowac
	}

	
	public void setPytanie(String pyt) {
		this.pyt = pyt;
	}
	
	public String getOdp() {
		return pyt;
	}

	public void setY(String y) {
		ZapytaniaJarvis.y = y;
	}
	
	public String getY() {
		return y;
	}

	

	@Override
	public String toString() {
		return "Pytanie [Nr " + DomowaController.n + ": " + pyt + "]";
	}
}
