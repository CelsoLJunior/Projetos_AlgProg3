package pilhaArray;

public class Menu {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();	

		System.out.println("Pilhas:");
		pilha.isEmpty();
		System.out.println(pilha.pop());
		System.out.println(pilha.peek());
		System.out.println(pilha.push(1));
		System.out.println(pilha.push(2));
		System.out.println(pilha.push(3));
		System.out.println(pilha.push(4));
		System.out.println(pilha.push(5));
		System.out.println(pilha.push(6));
		System.out.println(pilha.peek());
		System.out.println(pilha.pop());
		System.out.println(pilha.peek());
		
	}
}