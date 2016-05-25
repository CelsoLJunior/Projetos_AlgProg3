package trabalhoLeitura;

public class IteradorVetor<T> implements Iterador<T> {

	private MedicamentoDAOVetor<T> container;
	private int current;
	
	public IteradorVetor(MedicamentoDAOVetor<T> vetor) {
		this.container = vetor;
		this.current = 0;
	}
	
	public IteradorVetor(PacienteDAOVetor<T> pacienteDAOVetor) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasNext() {
		return current < container.getSize();
	}
	
	@Override
	public T next() {
		T data = container.get(current);
		current++;
		return data;
	}
	
	@Override
	public boolean hasPrevious() {
		return current > 0;
	}
	
	@Override
	public T previous() {
		current--;
		T data = container.get(current);
		return data;
	}
	
	@Override
	public void insert(T dado) {
		container.insert(current, dado);
		current++;
	}
	
	@Override
	public void remove() {
		container.remove(current-1);
	}	
}