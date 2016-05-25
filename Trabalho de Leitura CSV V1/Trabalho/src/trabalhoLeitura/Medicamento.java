package trabalhoLeitura;

public class Medicamento {

	private String codigo;
	private String nome;
	
	public Medicamento(String codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String getMedicamento() {
		String str="";
		str += "Nome: "+this.nome;
		str += " Codigo: "+this.codigo;
		return str;
	}
}
