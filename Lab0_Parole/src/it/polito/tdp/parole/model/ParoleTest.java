package it.polito.tdp.parole.model;

public class ParoleTest {

	public static void main(String[] args) {
		ParoleTest test = new ParoleTest() ;
		
		test.run() ;

	}
	
	private void run() {
		Parole p = new Parole() ;
		
		stampa(p) ;
		
		p.addParola("ciao") ;
		p.addParola("hello") ;
		
		stampa(p) ;
		
		p.addParola("pinco") ;
		p.addParola("pallino") ;
		
		stampa(p) ;

	}
	
	private void stampa(Parole p) {
		System.out.println("ELENCO:") ;
		
		for( String s: p.getElenco() )
			System.out.println(s) ;
		
		System.out.println("FINE\n") ;
	}

}
