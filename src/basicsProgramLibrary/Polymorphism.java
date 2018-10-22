package basicsProgramLibrary;

public class Polymorphism {

	public String main() {

		return "Karan";
	}

	public int main(int i) {
		System.out.println("Karan");
		return 1;
	}

	public void main(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {

		// anonymous object creation

		new Polymorphism().main("Karan");

		System.out.println(new Polymorphism().main());

		new Polymorphism().main(2);
	}

}
