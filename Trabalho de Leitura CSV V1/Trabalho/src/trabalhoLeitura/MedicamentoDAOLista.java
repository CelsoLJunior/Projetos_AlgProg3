package trabalhoLeitura;

class Node1<T> {
	private T data;
	private Node1<T> next;
	private Node1<T> previous;
	
	public Node1(T data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}

	public T getData() {
		return data;
	}

	public Node1<T> getNext() {
		return next;
	}

	public Node1<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node1<T> prev) {
		this.previous = prev;
	}

	public void setNext(Node1<T> next) {
		this.next = next;
	}

	public void insertBefore(T dado) {
		Node1<T> novo = new Node1<T>(dado);
		Node1<T> previous = this.getPrevious();
		novo.setPrevious(previous);
		novo.setNext(this);
		this.setPrevious(novo);
		previous.setNext(novo);
	}
	
}
public class MedicamentoDAOLista<T>
	implements java.lang.Iterable<T>
{

	private Node1<T> head;
	private Node1<T> tail;

	public IteradorListaEncadeada<T> iterator() {
		return new IteradorListaEncadeada<T>(this);
	}

	Node1<T> getHead() {
		return head;
	}

	public void append(T dado) {
		Node1<T> novo = new Node1<T>(dado);
		if (tail == null) {
			head = novo;
		} else {
			novo.setPrevious(tail);
			tail.setNext(novo);
		}
		tail = novo;
	}

	public void prepend(T dado) {
		Node1<T> novo = new Node1<T>(dado);
		if (head == null) {
			tail = novo;
		} else {
			novo.setNext(head);
			head.setPrevious(novo);
		}
		head = novo;
	}

	void remove(Node1<T> iter) {
		if (iter == null)
			return;
		if (iter == tail) {
			tail = tail.getPrevious();
			tail.setNext(null);
		} else
		if (iter == head) {
			head = head.getNext();
			head.setPrevious(null);
		} else {
			Node1<T> previous = iter.getPrevious();
			Node1<T> next = iter.getNext();
			next.setPrevious(previous);
			previous.setNext(next);
		}
	}

}