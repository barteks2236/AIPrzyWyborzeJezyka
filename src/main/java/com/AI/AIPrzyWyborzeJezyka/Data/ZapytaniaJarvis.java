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
						+ " Jesteś tutaj bo chcesz zostać zapewne programistą, a ja Ci w tym pomogę. Czy wiesz jakim typem programisty chcesz być? "
						+ "Gry(1), Web(2), Mobile(3), a może Analiza danych(4)? Odpowiedz jednym słowem lub cyfrą ;)");

/*2*/		danePytan.add(", czy jesteś tu pierwszy raz? Tak(1) czy nie(2)?");

/*3*/		danePytan.add(", świetny wybór, a na jakie systemy? Windows(1), MacOs(2) czy może Android(3)?");

/*4*/		danePytan.add(", wolisz gdy widzisz efekt swojej pracy(1) czy wystarczy Ci logika działania(2) czegoś? ");

/*5*/		danePytan.add(", w jakim stopniu posiadasz wiedzę z programowania w skali 1-3? gdzie 1 to słabo a 3 dobrze");

///*5*/		danePytan.add(", czy byłem pomocny? Tak(1) czy nie(2)?");

/*6*/ 		danePytan.add(", dziękuję za współpracę, już wiem jaki języ programowani jest dla Ciebie odpowiedni, pożegnaj się ze mną aby uzyskać odpowiedz, do zobaczenia! ");

	
/*KONIEC*/	danePytan.add(", Nie rozumiem. Jesli widzisz ten tekst to skonczyły mi się pytania, loading... ");		// ten tekst ma się NIE WYSWIETLAC, dodatkowa wartośc tabeli zeby zakonczyc, nie kasowac
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
