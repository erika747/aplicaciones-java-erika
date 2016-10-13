package listas;

public class Main {

	public static void main(String[] args) {
		ListaEnlazada<String> cosas = new ListaEnlazada(); 
		cosas.add("1");
		cosas.add("2");
		cosas.add("3");
		cosas.add("4");
		p(cosas.get(0));
		p(cosas.get(1));
		p(cosas.get(2));
		p(cosas.get(3));
	}

	public static void p(String s){
		System.out.println(s);
	}
	
}
