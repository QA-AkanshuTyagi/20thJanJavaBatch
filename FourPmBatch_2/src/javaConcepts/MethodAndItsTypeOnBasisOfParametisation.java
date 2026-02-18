package javaConcepts;

public class MethodAndItsTypeOnBasisOfParametisation {

	public static void main(String[] args) {
		
		
		parametrised("akanshu");
		parametrised("rahul","akhil");
	}

	public static void nonparametrised() {

	}

	public static void parametrised(String name) {

		System.out.println(name);
	}
	public static void parametrised(String name, String naam) {

		System.out.println(name);
		System.out.println(naam);
	}
	
	
}
