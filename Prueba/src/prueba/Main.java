package prueba;

import serverutils.Server;

public class Main {

	public static void main(String[] args) {
		MessageListener sdgih = new MessageListener();
		Server s = new Server(45200, sdgih);
		sdgih.s = s;

	}

}
