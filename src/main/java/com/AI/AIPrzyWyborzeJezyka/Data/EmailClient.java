package com.AI.AIPrzyWyborzeJezyka.Data;

import java.util.ArrayList;
import java.util.List;

public class EmailClient {
	
	private String emailAdres;
	private String temat;
	private String tresc;
	public static List<String> listaKlientow = new ArrayList<String>();
	
	public EmailClient() {}
	
	public EmailClient(String emailAdres, String temat, String tresc) {
		this.emailAdres = emailAdres;
		this.temat = temat;
		this.tresc = tresc;
	}

	public String getEmailAdres() {
		return emailAdres;
	}

	public void setEmailAdres(String emailAdres) {
		this.emailAdres = emailAdres;
	}

	public String getTemat() {
		return temat;
	}

	public void setTemat(String temat) {
		this.temat = temat;
	}

	public String getTresc() {
		return tresc;
	}

	public void setTresc(String tresc) {
		this.tresc = tresc;
	}

}
