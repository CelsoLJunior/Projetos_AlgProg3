package trabalhoLeitura;

import java.util.Iterator;

public class PacienteDAOVetor<T> implements Iterable<T> {
	
	private Object[] data;
	private int itemCount;
	
	public PacienteDAOVetor() {
		this.data = new Object[16];
		this.itemCount = 0;
	}
	
	private int getIncrement() {
		final int MAX_CHUNK = 2048;
		if (data.length >= MAX_CHUNK) {
			return data.length + MAX_CHUNK;
		} else {
			return data.length*2;
		}
	}

	private void ensureMemoryAvailable() {
		if (itemCount != data.length)
			return;
		Object[] newdata = new Object[getIncrement()];
		System.arraycopy(data, 0, newdata, 0, itemCount);
		data = newdata;
	}

	public void insert(int index, T value) {
		ensureMemoryAvailable();
		System.arraycopy(data, index, data, index+1, itemCount-index);
		this.data[index] = value;
		this.itemCount++;
	}

	public void remove(int index) {
		if (index < 0 || index >= itemCount)
			throw new ArrayIndexOutOfBoundsException("Indice invalido: "+index);
		System.arraycopy(data, index+1, data, index, itemCount-index);
		itemCount--;
	}
	
	@SuppressWarnings("unchecked") // Necessario para evitar "warning".
	public T get(int index) {
		if (index < 0 || index >= itemCount)
			throw new ArrayIndexOutOfBoundsException("Indice invalido: "+index);
		return (T)data[index]; // Este "cast" e seguro, e sempre vai funcionar.
	}
	
	public int getCapacity() {
		return data.length;
	}
	
	public int getSize() {
		return itemCount;
	}

	public void append(T value) {
		insert(itemCount,value);
	}
	
	@Override
	public Iterador<T> iterator() {
		return new IteradorVetor<T>(this);
	}
}