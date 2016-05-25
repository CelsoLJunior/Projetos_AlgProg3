package trabalhoLeitura;

public interface Iterador<T>
	extends java.util.Iterator<T>
{
	boolean hasPrevious();
	
	T previous();

	void insert(T dado);
	
	void remove();
}