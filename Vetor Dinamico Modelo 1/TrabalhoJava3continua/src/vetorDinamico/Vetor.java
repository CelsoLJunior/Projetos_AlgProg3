package vetorDinamico;

public class Vetor {

	private int quant_data=0;
	private int[] vet = new int[5];
	
	public void insertLast(int data){
		if(this.quant_data == this.vet.length){
			increaseVet();
		}
		this.vet[this.quant_data] = data;
		this.quant_data++;
	}
	public void removeLast(){
		this.quant_data--;
	}
	public void insertMiddle(int data, int local){
		if(local > quant_data || local < 0){
			System.out.println("Local inválido");
		}
		else if (local == quant_data) {
			insertLast(data);
		}
		else{
			if (quant_data == vet.length) {
				increaseVet();
			}
			for (int i = quant_data; i > local; i--) {
				vet[i] = vet[i-1];
			}
			vet[local] = data;
			quant_data++;
		}
	}
	public void showElement(int local){
		if(local >= quant_data || local < 0){
			System.out.println("Local inexistente");
		}
		else{
			System.out.println(vet[local]);
		}
	}
	public void removeData(int local){
		int teste=0;
		
		if(local >= quant_data || local < 0){
			System.out.println("Local não existente!");
		}
		else{
			if (local == quant_data-1) {
				quant_data--;
			}
			else {
				for (int i = local; i < quant_data; i++) {
					vet[i] = vet[i+1];
				}
				removeLast();
			}
		}
	}
	public void	increaseVet(){
		int[] novo = new int[this.vet.length+5];
		
		System.arraycopy(vet,0, novo,0, vet.length);
		
		this.vet = novo;
	}
	public void showVet(){
		for (int i = 0; i < quant_data; i++) {
			System.out.println(vet[i]+" tamanho="+vet.length);
		}
	}
}