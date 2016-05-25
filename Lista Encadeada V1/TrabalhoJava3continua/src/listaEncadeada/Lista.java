package listaEncadeada;

public class Lista {

	private Node head;
	private Node tail;

	public void insertLast(int dado) {
		Node novo = new Node(dado);
		if (isEmpty()) {
			head = novo;
			tail = novo;
			return;
		}
		Node ant = null;
		Node iter = head;
		
		while (iter != null) {
			ant = iter;
			iter = iter.getProximo();
		}
		insertAfter(ant, novo);	
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void showList() {
		Node iter = head;
		
		while (iter != null) {
			System.out.print(iter.getValue() + "; ");
			iter = iter.getProximo();
		}
		System.out.println();
	}
	private void insertAfter(Node ant, Node novo) {
		if (ant == null) {
			novo.setProximo(head);
			head = novo;
		} else {
			Node proximo = ant.getProximo();
			novo.setProximo(proximo);
			ant.setProximo(novo);
		}
	}
	public void insertAfterValue(int anterior, int novo) {
		Node iter = head;
		
		while (iter != null) {
			if (iter.getValue() == anterior) {
				//iter.s
			}
			else {
				iter = iter.getProximo();	
			}
		}
	}
	public void insertBeforeValue(int i, int j) {
		
	}
	public void insertHead(int dado) {
		Node novo = new Node(dado);
		if (isEmpty()) {
			head = novo;
			tail = novo;
			return;
		}
		head.setAnterior(novo);
	}
	public void removeTail() {
		if (isEmpty()) {
			return;
		}
		Node ant = null;
		Node iter = head;
		while (iter != null) {
			ant = iter;
			iter = iter.getProximo();
		}
	}
	public void showHead() {
		System.out.println(head.getValue());
	}
	public void showTail() {
		System.out.println(tail.getValue());
	}	
}