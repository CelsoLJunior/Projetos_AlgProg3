package listaEncadeada;

public class Node {

	private int dado;
	private Node prox;
	private Node ant;

	public Node(int dado) {
		this.dado = dado;
		this.prox = null;
		this.ant = null;
	}
	public int getValue() {
		return this.dado;
	}
	public void setValue(int dado) {
		this.dado = dado;
	}
	public Node getProximo() {
		return prox;
	}
	public void setProximo(Node prox) {
		this.prox = prox;
	}
	public Node getAnterior() {
		return ant;
	}
	public void setAnterior(Node ant) {
		this.ant = ant;
	}
}