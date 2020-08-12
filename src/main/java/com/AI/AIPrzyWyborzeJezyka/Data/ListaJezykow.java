package com.AI.AIPrzyWyborzeJezyka.Data;

import java.util.ArrayList;
import java.util.List;

public class ListaJezykow {

	private static List<JezykiProgramowania> listaJezykow = new ArrayList<JezykiProgramowania>();
	private static List<JezykiProgramowania> listaJezykowFront = new ArrayList<JezykiProgramowania>();
	private static List<JezykiProgramowania> listaJezykowBack = new ArrayList<JezykiProgramowania>();
	private static List<JezykiProgramowania> listaJezykowGry = new ArrayList<JezykiProgramowania>();
	private static List<JezykiProgramowania> listaJezykowGry2 = new ArrayList<JezykiProgramowania>();
	
	static {
		listaJezykow.add(new JezykiProgramowania("R"));
		listaJezykow.add(new JezykiProgramowania("python"));
		listaJezykow.add(new JezykiProgramowania("scala"));
		listaJezykow.add(new JezykiProgramowania("SQL"));
		listaJezykow.add(new JezykiProgramowania("swift"));
		listaJezykow.add(new JezykiProgramowania("java"));
		listaJezykow.add(new JezykiProgramowania("CSharp"));
		
		listaJezykowFront.add(new JezykiProgramowania("HTML"));
		listaJezykowFront.add(new JezykiProgramowania("CSS"));
		listaJezykowFront.add(new JezykiProgramowania("JavaScript"));
		
		listaJezykowBack.add(new JezykiProgramowania("python"));
		listaJezykowBack.add(new JezykiProgramowania("java"));
		listaJezykowBack.add(new JezykiProgramowania("ruby"));
		
		listaJezykowGry.add(new JezykiProgramowania("CSharp"));
		listaJezykowGry.add(new JezykiProgramowania("unity"));
		
		listaJezykowGry2.add(new JezykiProgramowania("CPlus"));
		listaJezykowGry2.add(new JezykiProgramowania("unreal"));
	}
	
	public static List<JezykiProgramowania> getListaJezykow(){
		return listaJezykow;
	}
	
	public static List<JezykiProgramowania> getListaJezykowFront(){
		return listaJezykowFront;
	}
	
	public static List<JezykiProgramowania> getListaJezykowBack(){
		return listaJezykowBack;
	}
	
	public static List<JezykiProgramowania> getListaJezykowGry(){
		return listaJezykowGry;
	}
	
	public static List<JezykiProgramowania> getListaJezykowGry2(){
		return listaJezykowGry2;
	}
}
