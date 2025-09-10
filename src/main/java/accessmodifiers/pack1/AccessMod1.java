package accessmodifiers.pack1;

public class AccessMod1 {
	
	 public String name = "Bharath";
	 public String email = "Bharath@test.com";
	
	 public void printEmpId() {
		System.out.println(1234);
	}

	public static void main(String[] args) {
		AccessMod1 obj = new AccessMod1();
		System.out.println(obj.name);
		obj.printEmpId();
	}
	
	public String getName() {
		return name;
	}

}
