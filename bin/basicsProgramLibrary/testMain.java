import org.apache.bcel.generic.NEW;

public class testMain {

	int nameID;
	String name;
	public static void main(String[] args) {
		MethodOverload.main("args");
		
		testMain s=new testMain();
		s=new testMain(2);
		s=new testMain(2,3);
		s=new testMain("Karan", 12);
	
		System.out.println(s.name);
		System.out.println(s.nameID);
	}

	public testMain() {
	System.out.println("TEst Constructor1");
	}
	
	public testMain(int a) {
		System.out.println("TEst Constructor2");
		}
	
	public testMain(int a,int j) {
		System.out.println("TEst Constructor3");
		}
	
	public testMain(String nameref,int nameIDref) {
		name=nameref;
		nameID=nameIDref;
	}

	public int getNameID() {
		return nameID;
	}

	public void setNameID(int nameID) {
		this.nameID = nameID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
