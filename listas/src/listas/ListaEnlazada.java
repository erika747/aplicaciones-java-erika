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
		
		Nodo<T> puntero = primero;
		
		int i = 0;
		while(puntero != null){
			if(i == posicion){
				puntero.elemento = elemento;
				return;
			}
			puntero = puntero.siguiente;
			i++;
		}
		
	}

	@Override
	public void insert(T elemento, int posicion) {
		Nodo<T> nuevo = new Nodo(elemento);
		if(posicion == 0){
			nuevo.siguiente = primero;
			primero = nuevo;
			return;
		}
		if(posicion == size-1){
			add(elemento);
			return;
		}
		if(posicion >= size){
			throw new IndexOutOfBoundsException("Index: "+posicion);
		}
		Nodo<T> puntero = primero;
		int i = 0;
		while(puntero != null){
			if(i == posicion-1){
				nuevo.siguiente = puntero.siguiente;
				puntero.siguiente = nuevo;
				size++;
				return;
			}
			puntero = puntero.siguiente;
			i++;
			
		}
		
	}

	@Override
	public T remove(int index) {
		Nodo<T> puntero = primero;
		int i = 0;
		while(puntero != null){
			if(i == index-1){
				Nodo<T> guardar = puntero.siguiente;
				puntero.siguiente = puntero.siguiente.siguiente;
				return guardar.elemento;
			}
			puntero = puntero.siguiente;
			i++;
		}
		size--;
		return null;
	}

	@Override
	public void remove(T elemento) {
		remove(indexOf(elemento));
		
		return;
		
		
	}

	@Override
	public int size() {
		
		return size;
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
		primero = null;
		size = 0;
		
	}

	@Override
	public int indexOf(T elemento) {
		Nodo<T> puntero = primero;
		int i = 0;
		
		while(puntero.elemento != elemento){
			
			puntero = puntero.siguiente;
			i++;
			
			if(puntero == null){
				return -1;
			}
			
		}
		return i;
	}

	@Override
	public int lastIndexOf(T elemento) {
		Nodo<T> puntero = primero;
		Nodo<T> chosen = null;
		int i = 0;
		
		while(puntero != null){
			if(puntero.elemento == elemento){
				chosen = puntero;
			}
			puntero = puntero.siguiente;
			i++;
		}
		if(chosen == null){
			return -1;
		}else{
			return i;
		}
		
	}
	
	private class Nodo<T> {
		private  T elemento;
		private Nodo siguiente;
		
		public Nodo(T elemento2){
			this.elemento = elemento2;
		}
	}
	

}
