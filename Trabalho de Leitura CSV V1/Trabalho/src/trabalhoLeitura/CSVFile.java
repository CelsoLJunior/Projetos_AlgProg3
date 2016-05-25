package trabalhoLeitura;

import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
	
public class CSVFile<T> implements CSVParser<T>{
	
	private CSVParser objectParser;
	
	public void openP(String filename) {
		
		try { 
			FileReader arq = new FileReader(filename); 
			BufferedReader lerArq = new BufferedReader(arq); 
			String linha = lerArq.readLine();
			
			while (linha != null) { 
				String[] teste = linha.split(";");
				Paciente paciente = new Paciente(teste[1], teste[0], teste[2]);
				setParserP(paciente);
				linha = lerArq.readLine();
			}
			arq.close(); 
		}
		catch (IOException e) { 
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
		}
	}
	public void openM(String filename) {
		
		try { 
			FileReader arq = new FileReader(filename); 
			BufferedReader lerArq = new BufferedReader(arq); 
			String linha = lerArq.readLine();
			
			while (linha != null) { 
				String[] teste = linha.split(";");
				Medicamento medicamento = new Medicamento(teste[0], teste[1]);
				setParserM(medicamento);
				linha = lerArq.readLine();
			}
			arq.close(); 
		}
		catch (IOException e) { 
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
		}
	}
	public T readObjectP() {
		for (int i = 0; i < PacienteParser.pacientes.size(); i++) {
			System.out.printf("Registro nº %d - %s\n", i, PacienteParser.pacientes.get(i).getPaciente());
		}
		return null;
	}
	public T readObjectM() {
		for (int i = 0; i < MedicamentoParser.medicamentos.size(); i++) {
			System.out.printf("Registro nº %d - %s\n", i, MedicamentoParser.medicamentos.get(i).getMedicamento());
		}
		return null;
	}
	public void setParserP(Paciente paciente) {
		CSVParser.parseObjectP(paciente);
	}
	public void setParserM(Medicamento medicamento) {
		CSVParser.parseObjectM(medicamento);
	}
	public void escolhaArmazenamento(int escolha) {
		// TODO Auto-generated method stub
		
	}
}
