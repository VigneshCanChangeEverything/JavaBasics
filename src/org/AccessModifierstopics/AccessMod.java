package org.AccessModifierstopics;


// it's applicable only for Attributes, methods and Constructor

class hop{
	
	private String y ="Papa";
	public String s1 ="Abc";
	private String s2 = "CDE";
	private int g =  45;
	

	void Setpulla(String s2 , String y, int g) { // Get set parameterize 
		
		this.s2 = s2;
		this.y =  y;
		this.g = g;
		
	}
	
	String getpulla() {
		
		return s2;
		
	}
	
	
	String getyulla() {
		
		return y ;
	}
	
	int getgulla()
	{
		return g;
		
	}	
	
}


public class AccessMod {
	
	int a;

public AccessMod(int a ) {
	
	this.a = a;
		
}

	public static void main(String[] args) {
		
		AccessMod ab = new AccessMod(100);
		
		System.out.println(ab.a);
		
		hop aw = new hop();	
		
		System.out.println(aw.s1);
		System.out.println(aw.getpulla());
		System.out.println(aw.getyulla());
		System.out.println(aw.getgulla());
	
	}



		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


