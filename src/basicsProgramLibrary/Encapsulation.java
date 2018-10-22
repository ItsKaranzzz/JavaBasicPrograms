package basicsProgramLibrary;

public class Encapsulation {

	// Encapsulation also called Data Hiding

	// Here we have private data members hidden from outside world

	// 1. Data member : data variables
	private int Mid;
	private String mindName;
	private int exp;

	// 2. Data member : methods to call the private variables

	public int getMid() {
		return Mid;
	}

	public void setMid(int mid) {
		Mid = mid;
	}

	public String getMindName() {
		return mindName;
	}

	public void setMindName(String mindName) {
		this.mindName = mindName;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public static void main(String[] args) {

		Encapsulation e = new Encapsulation();
		e.setMid(321455);
		e.setExp(3);
		e.setMindName("Karan");

		System.out.println(e.getMindName());
		System.out.println(e.getExp());
	}

}
