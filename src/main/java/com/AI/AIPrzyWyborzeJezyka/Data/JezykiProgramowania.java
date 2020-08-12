package com.AI.AIPrzyWyborzeJezyka.Data;

public class JezykiProgramowania {
	
	private String name;
	private String link;
	
	public JezykiProgramowania(String name) {
		this.name = name;
		this.link = name + "Logo.png";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
