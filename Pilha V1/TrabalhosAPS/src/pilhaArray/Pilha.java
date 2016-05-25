package pilhaArray;

public class Pilha {

	private int quant_data=0;
	private int[] vet = new int[5];
	
	public String push(int data) {
		if(this.quant_data == this.vet.length){
			return "Pilha cheia!";
		}
		this.vet[this.quant_data] = data;
		this.quant_data++;
		
		String element = peek();
		return "Elemento "+element+" adicionado à pilha";
	}
	public String pop() {
		if(isEmpty() == true){
			return "Pilha vazia!";
		}
		else{
			String element = peek();
			this.quant_data--;
			return "Elemento "+element+" retirado da pilha";
		}
	}
	public boolean isEmpty() {
		if(quant_data == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public String peek() {
		int element=0;
		if(isEmpty() == true){
			return "Pilha vazia!";
		}
		else{
			element = vet[quant_data-1];
			return ""+element;
		}
	}
}