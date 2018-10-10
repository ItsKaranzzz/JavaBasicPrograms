package basicsProgramLibrary;

public class InnerClass {

	String name;

	public static void main(String[] args) {
		// we cannot instantiate inner class objects simply
		// we have to initiate using the original class name and making inner class as
		// member of orig class

		InnerClass.Student s = new InnerClass().new Student();
		InnerClass.Divisions d = new InnerClass().new Divisions();
		s.test();
		d.test2();

	}

	public class Student {
		public void test() {
			System.out.println("Karan Studies in class 12th");
		}

	}

	public class Divisions {
		public void test2() {
			System.out.println("He is in section C");
		}
	}
}
