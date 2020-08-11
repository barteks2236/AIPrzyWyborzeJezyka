package com.AI.AIPrzyWyborzeJezyka.Neuron;
import java.util.ArrayList;
import java.util.List;

import com.AI.AIPrzyWyborzeJezyka.Controller.DomowaController;

public class Neuron {
// wsp�czynnik uczenia = 1;

	public int n = 1;
	public List<Integer> wagi;
	public List<Data> dane = DomowaController.dane;
	public int decyzja = DomowaController.czyPomoglem;
	public int net;
	public boolean czyWymagaUczenia;
	public static boolean czyWymagaPowtorki;

	public Neuron() {
		wagi = new ArrayList<Integer>();
		wagi.add(1);
		wagi.add(1);
		wagi.add(1);		
		wagi.add(1);
	}

	public void zaladujDane(List<Data> dane) {
		this.dane = dane;
	}

	public void uczSie() {
		czyWymagaPowtorki = false;
		for (Data dana : dane) {
			czyWymagaUczenia = true;
			do {
				wyliczNet(dana);
				podejmijDecyzje(dana);
				if (czyWymagaUczenia) {
					korektaWag(dana);
					czyWymagaPowtorki = true;
				}

			} while (czyWymagaUczenia);
		}
	}

	private void korektaWag(Data dana) {
//		Ws = Ws + n * (oczekiwana - otrzymana) * wejscie

		ArrayList<Integer> noweWagi = new ArrayList<Integer>();

		for (int i = 0; i < wagi.size(); i++) {
			int nowaWaga;
			int wejscie = dana.getData().get(i);
			int oczekiwana = dana.getDecyzja();
			nowaWaga = wagi.get(i) + n * (oczekiwana - decyzja) * wejscie;
		
			noweWagi.add(nowaWaga);
			
		}
		wagi = noweWagi;
	}

	private void wyliczNet(Data dana) {
		int suma = 0;

		for (int i = 0; i < dana.getData().size(); i++)
			suma += dana.getData().get(i) * wagi.get(i);

		net = suma;

	}

	private void podejmijDecyzje(Data dana) {
		decyzja = (net >= 0 ? 1 : 0);
		czyWymagaUczenia = decyzja != dana.getDecyzja();
	}

	public List<Integer> getRESULT() {
		
		return wagi;
	}
}
