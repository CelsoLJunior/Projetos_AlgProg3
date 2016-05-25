package trabalhoLeitura;

import java.util.Scanner;

public class TestApplication {
	
	static public Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		int escolha=0;
		System.out.println("Nome do arquivo de pacientes a ser lido: ");
		String nomeArqPaciente = e.nextLine();
		
		CSVFile arquivoPaciente = new CSVFile();
		
		do {
			System.out.println("Tipo de armazenamento para arquivo de pacientes: \n 1 = Vetor\n 2 = Lista");
			escolha = e.nextInt();	
		} while (escolha != 1 && escolha != 2);
				
		arquivoPaciente.escolhaArmazenamento(escolha);
		arquivoPaciente.openP(nomeArqPaciente);
		arquivoPaciente.readObjectP();
		
		System.out.println("\n\n");
		e.nextLine();
		System.out.println("Nome do arquivo de medicamentos a ser lido: ");
		String nomeArqMedicamento = e.nextLine();
		
		CSVFile arquivoMedicamento = new CSVFile();
		
		do {
			System.out.println("Tipo de armazenamento para arquivo de medicamentos: \n 1 = Vetor\n 2 = Lista");
			escolha = e.nextInt();	
		} while (escolha != 1 && escolha != 2);
		
		arquivoMedicamento.escolhaArmazenamento(escolha);
		arquivoMedicamento.openM(nomeArqMedicamento);
		arquivoMedicamento.readObjectM();
		
	}
}