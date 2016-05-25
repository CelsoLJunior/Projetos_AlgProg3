package trabalhoLeitura;

public class IteradorListaEncadeada<T> implements Iterador<T>
{
	private Node1<T> iter;
	private Node1<T> previous;
	private MedicamentoDAOLista<T> list;
	

	public IteradorListaEncadeada(MedicamentoDAOLista<T> listaEncadeada) {
		this.list = listaEncadeada;
		this.iter = listaEncadeada.getHead();
		this.previous = null;
	}

	public IteradorListaEncadeada(PacienteDAOLista<T> pacienteDAOLista) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasNext() {
		return iter != null;
	}

	@Override
	public T next() {
		T result = null;
		if (hasNext()) {
			result = iter.getData();
			previous = iter;
			iter = iter.getNext();
		}
		return result;
	}

	@Override
	public boolean hasPrevious() {
		return previous != null;
	}

	@Override
	public T previous() {
		T result = null;
		if (hasPrevious()) {
			result = previous.getData();
			iter = previous;
			previous = previous.getPrevious();
		}
		return result;
	}

	@Override
	public void insert(T dado) {
		if (!hasNext()) {
			list.append(dado);
		} else
		if (!hasPrevious()){
			list.prepend(dado);
		} else {
			iter.insertBefore(dado);
		}
	}
	
	@Override
	public void remove() {
		if (iter != null)
			list.remove(iter);
		else
			list.remove(previous);
	}
	
}