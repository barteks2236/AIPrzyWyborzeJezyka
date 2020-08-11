package com.AI.AIPrzyWyborzeJezyka.Neuron;
import java.util.ArrayList;
import java.util.List;

import com.AI.AIPrzyWyborzeJezyka.Controller.DomowaController;

public class Data {

	public static List<Integer> data = new ArrayList<Integer>();
	public int decyzja;
	
	public Data(List<Integer> data, int decyzja) {
		super();
		Data.data = data;
		this.decyzja = decyzja;

	}
	
	public void setData(List<Data> dane){
		DomowaController.dane=dane;
	}
	
	public List<Integer> getData(){
		return data;
	}
	
	public void setDecyzja(int decyzja){
		DomowaController.czyPomoglem=decyzja;
	}
	
	public int getDecyzja() {
		return DomowaController.czyPomoglem;
	}

	@Override
	public String toString() {
		return "Data [data=" + data + ", decyzja=" + decyzja + "]";
	}
	
	
}
