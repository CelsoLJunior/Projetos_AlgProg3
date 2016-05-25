package vetorDinamico;

public class Menu {

	public static void main(String[] args) {
		
		Vetor vet = new Vetor();	

		vet.insertLast(1);
		vet.insertLast(2);
		vet.insertLast(3);
		vet.insertLast(4);
		vet.insertLast(5);
		
		vet.showVet();	
		System.out.println("---");
		vet.showElement(-1);
		System.out.println("---");
		vet.insertMiddle(6, 5);
		vet.showVet();
		System.out.println("---");
		vet.insertMiddle(9, 2);
		vet.showVet();
		System.out.println("---");
		vet.insertMiddle(98, 1);
		vet.insertMiddle(98, 1);
		vet.insertMiddle(98, 1);
		vet.insertMiddle(98, 1);
		vet.insertMiddle(98, 1);
		vet.insertMiddle(98, 1);
		vet.insertMiddle(98, 1);
		vet.showVet();
		System.out.println("---");
		vet.removeData(-1);
		System.out.println("---");
		vet.removeData(10);
		System.out.println("---");
		vet.removeData(2);
		System.out.println("---");
		vet.showVet();
		vet.removeData(4);
		System.out.println("---");
		vet.showVet();
		vet.removeLast();
		vet.removeLast();
		vet.removeLast();
		System.out.println("---");
		vet.showVet();
	}
}