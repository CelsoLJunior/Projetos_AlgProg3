package trabalhoLeitura;

class Node<T> {
	private T data;
	private Node<T> next;
	private Node<T> previous;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}

	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}

	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> prev) {
		this.previous = prev;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public void insertBefore(T dado) {
		Node<T> novo = new Node<T>(dado);
		Node<T> previous = this.getPrevious();
		novo.setPrevious(previous);
		novo.setNext(this);
		this.setPrevious(novo);
		previous.setNext(novo);
	}
	
}
public class PacienteDAOLista<T>
	implements java.lang.Iterable<T>
{

	private Node<T> head;
	private Node<T> tail;

	public IteradorListaEncadeada<T> iterator() {
		return new IteradorListaEncadeada<T>(this);
	}

	Node<T> getHead() {
		return head;
	}

	public void append(T dado) {
		Node<T> novo = new Node<T>(dado);
		if (tail == null) {
			head = novo;
		} else {
			novo.setPrevious(tail);
			tail.setNext(novo);
		}
		tail = novo;
	}

	public void prepend(T dado) {
		Node<T> novo = new Node<T>(dado);
		if (head == null) {
			tail = novo;
		} else {
			novo.setNext(head);
			head.setPrevious(novo);
		}
		head = novo;
	}

	void remove(Node<T> iter) {
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
			Node<T> previous = iter.getPrevious();
			Node<T> next = iter.getNext();
			next.setPrevious(previous);
			previous.setNext(next);
		}
	}

}