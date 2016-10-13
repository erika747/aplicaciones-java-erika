package listas;

public class ListaEnlazada<T> implements Lista<T>{
	 
	private Nodo<T> primero;
	private int size = 0;

	@Override
	public void add(T elemento) {
		Nodo<T> puntero = primero;
		Nodo<T> nuevo = new Nodo<T>(elemento);
		if(isEmpty()){
			primero = nuevo;
			size++;
			return;
		}
		while(puntero.siguiente != null){
			puntero = puntero.siguiente;
		}
		 puntero.siguiente = nuevo;
		 size++;
	}

	@Override
	public T get(int posicion) {
		
		Nodo<T> puntero = primero;
		int i = 0;
		while(puntero != null){
			if(i == posicion){
				return puntero.elemento;
			}
			puntero = puntero.siguiente;
			i++;
		}
		return null;
	}

	@Override
	public void set(T elemento, int posicion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(T elemento, int posicion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(T elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		if(primero == null){
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int indexOf(T elemento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(T elemento) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private class Nodo<T> {
		private  T elemento;
		private Nodo siguiente;
		
		public Nodo(T elemento2){
			this.elemento = elemento2;
		}
	}
	

}
