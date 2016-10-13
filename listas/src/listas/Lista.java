
package listas;

public interface Lista<T> {
	
	/*
	 * Ańade un elemento a la lista
	 */
	void add(T elemento);
	
	/*
	 * Obtiene un elemento de la lista de la posicion posicion
	 * 
	 */
	T get(int posicion);
	
	/*
	 * Sustituye el elemento de la lista de la posicion posicion por el elemento dado
	 * 
	 */
	void set(T elemento,int posicion);
	
	/*
	 * Inserta un elemento en la posicion dada
	 */
	void insert(T elemento,int posicion);
	
	/*
	 * Elimina un elemento de la lista de la posicion index y lo devuelve
	 * 
	 */
	T remove(int index);
	
	/*
	 * Elimina el elemento de la lista 
	 */
	void remove(T elemento);
	
	/*
	 * Devuelve el numero de elementos de la lista
	 */
	int size();
	
	/*
	 * Devuelve verdadero si la lista esta vacia
	 */
	boolean isEmpty();
	
	/*
	 * Elimina todos los elementos de la lista
	 */
	void clear();
	
	/*
	 * Devuelve la posicion de la primera aparicion del elemento en el array o -1 si no lo encuentra
	 */
	int indexOf(T elemento);
	
	
	/*
	 * Devuelve la posicion de la ultima aparicion del elemento en el array o -1 si no lo encuentra
	 */
	int lastIndexOf(T elemento);
	
}
