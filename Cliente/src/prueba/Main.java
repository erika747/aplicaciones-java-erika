package prueba;

import java.util.Scanner;

import clientutils.Client;


public class Main {

	public static void main(String[] args) {
		MessageListener sdgih = new MessageListener();
		Client c = new Client("192.168.1.167", 45200, sdgih);
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()){c.sendObject(s.nextLine());}
	}

}
