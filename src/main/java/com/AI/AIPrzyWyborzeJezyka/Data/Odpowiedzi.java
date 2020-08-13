package com.AI.AIPrzyWyborzeJezyka.Data;

import java.util.ArrayList;
import java.util.List;

import com.AI.AIPrzyWyborzeJezyka.Controller.DomowaController;


public class Odpowiedzi {
	
	public String odp;
	public static String x; 	// Zmienna String konkretnego pytania	
	public static String imie; 
	public static List<Odpowiedzi> daneOdp = new ArrayList<Odpowiedzi>();
	public static List<String> daneOdp2 = new ArrayList<String>();
	public static int waga;
//	public Osoba() {}
	
//	public Osoba(String imie) {
//		this.imie = imie;
//	}
	
	public void setOdp(String odp) {
		this.odp = odp;
	}
	
	public String getOdp() {
		return odp;
	}

	public void setX(String x) {
		Odpowiedzi.x = x;
	}
	
	public String getX() {
		return x;
	}

	public void setImie(String imie) {
		Odpowiedzi.imie = imie;
	}
	
	public static String getImie() {
		return imie;
	}


	public void setWaga(int waga) {
		Odpowiedzi.waga = waga;
	}
	
	public int getWaga() {
		return waga;
	}
	
	@Override
	public String toString() {
		return "Odpowiedz [Nr " + DomowaController.n + ": " + odp + "]";
	}
}
