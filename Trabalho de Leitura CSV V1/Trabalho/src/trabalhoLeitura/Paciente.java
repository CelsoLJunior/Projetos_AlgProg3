package trabalhoLeitura;

public class Paciente {

	private String RG;
	private String nome;
	private String dataNascimento;
	
	public Paciente(String RG, String nome, String dataNascimento){
		this.RG = RG;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public String getPaciente() {
		String str="";
		str += "Nome: "+this.nome;
		str += " RG: "+this.RG;
		str += " Data de Nascimento: "+this.dataNascimento;
		return str;
	}
}
