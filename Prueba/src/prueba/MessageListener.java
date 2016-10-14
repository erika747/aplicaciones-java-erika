package prueba;

import serverutils.Listener;
import serverutils.MessageHandler;
import serverutils.Server;

public class MessageListener implements MessageHandler{
	public Server s;
	@Override
	public void objectReceived(Object arg0, Listener arg1) {
		System.out.println(arg0);
		for(Listener client : s.listeners){
			if(!client.idS.equals(arg1.idS)){
				client.sendObject(client.s, arg0);
			}
		}
		
	}

}
