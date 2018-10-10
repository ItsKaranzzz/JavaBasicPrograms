package basicsProgramLibrary;

public class MultipleInterfacing implements TestInterface, TestInterface2 {

	public static void main(String[] args) {
		// Upcasting
		// Runtime polymorphism
		// Dynamic Binding
		TestInterface t = new MultipleInterfacing();
		t.test01();
		TestInterface2 u = new MultipleInterfacing();
		u.test05();
		u.test01();
		t.test01();
		MultipleInterfacing p = new MultipleInterfacing();
		p.test01();
		p.test02();
		p.test05();
		p.tet03();

	}

	// Overriding
	@Override
	public void test01() {
		System.out.println("Hero");
	}

	@Override
	public void test02() {
		System.out.println("Zero");
	}

	@Override
	public void tet03() {
		System.out.println("Tero");
	}

	public void test05() {
		System.out.println("Kero");
	}

}
