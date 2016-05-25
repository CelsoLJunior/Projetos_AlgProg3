package listaEncadeada;

public class Menu {

	public static void main(String[] args) {

		Lista lista = new Lista();
				
		lista.insertLast(1);
		lista.insertLast(2);
		lista.insertLast(4);
		lista.showList();
		System.out.print("Head = ");
		lista.showHead();
		
		
		/*
		System.out.print("Tail = ");
		lista.showTail();
		
		lista.insertAfterValue(2, 3);
		lista.insertBeforeValue(2, 3);
		lista.insertHead(9);
		lista.removeTail();
		lista.showList();
		*/
	}

}
