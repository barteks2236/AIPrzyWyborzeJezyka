package com.AI.AIPrzyWyborzeJezyka.Data;

import java.util.ArrayList;
import java.util.List;


public class Osoba {

	public String imie;
	public static List<Osoba> daneOsoby = new ArrayList<Osoba>();

//	public Osoba() {}
	
//	public Osoba(String imie) {
//		this.imie = imie;
//	}
	
	public void setImie(String imie) {
		this.imie = imie;
	}
	
	public String getImie() {
		return imie;
	}



	@Override
	public String toString() {
		return "Osoba [imie=" + imie + "]";
	}
}
