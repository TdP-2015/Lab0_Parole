package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole {
	
	private List<String> elenco ;
	
	public Parole() {
		this.elenco = new ArrayList<String>() ;
	}
	
	public void addParola(String p) {
		this.elenco.add(p) ;
		
		Collections.sort(elenco) ;
	}
	
	public List<String> getElenco() {
		return elenco ;
	}

}
