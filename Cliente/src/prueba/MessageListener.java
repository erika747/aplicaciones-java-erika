package prueba;

import clientutils.MessageHandler;

public class MessageListener implements MessageHandler{

	@Override
	public void objectReceived(Object arg0) {
		System.out.println(arg0);
		
	}

	

}
