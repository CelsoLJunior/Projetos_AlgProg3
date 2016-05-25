package trabalhoLeitura;

public interface CSVParser <T>{

	public static void parseObjectP(Paciente paciente) {
		PacienteParser.addList(paciente);
	}
	public static void parseObjectM(Medicamento medicamento) {
		MedicamentoParser.addList(medicamento);
	}
}
