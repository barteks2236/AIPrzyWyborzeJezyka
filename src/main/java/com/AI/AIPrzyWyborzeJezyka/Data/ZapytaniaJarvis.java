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
		
		
		
		danePytan.add(", Fajne imię, miło mi Cię poznać, ja jestem Java Artificial Rare Virtual Inteligent System, ale mów mi J.A.R.V.I.S.\n"
				+ " Jesteś tutaj bo szukasz odpowiedniego języka programowania do nauki, tak? ");
		danePytan.add(", w takim razie świetnie trafiłeś, postaram Ci się pomóc ale żebym mógł to zrobić najlepiej jak potrafię to musisz mi odpowiedzieć na kilka ważnych pytań, ok? ");
		
		
		
		danePytan.add(", Jesli widzisz ten tekst to skonczyły mi się pytania, loading... ");		// ten tekst ma się NIE WYSWIETLAC, dodatkowa wartośc tabeli zeby zakonczyc, nie kasowac
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
