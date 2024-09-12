package org.AccessModifierstopics;


class Worldcup2011{
	
	final String op ="wnwheubeeu";
	
	
	
public final  void Win()
	{
		System.out.println("India wins");
	}	
	
}


public class NonAccessModifiers_MethodandAttributelevel extends Worldcup2011{

	//eg
//	public void Win() {
//		// final method with same name which can't be over ridden in the sub class..
//		
//	}
//	
	
public static void main(String[] args) {
	

	NonAccessModifiers_MethodandAttributelevel s = new NonAccessModifiers_MethodandAttributelevel();
	
	s.Win();
	
//	s.op = "hwiedjdb"; // Attributes cannot be overridden 
	
	System.out.println(s.op);
	
	
	
	
	
	
	
}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
