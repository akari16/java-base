package Test13;

public class SubClass extends SuperClass {
	public SubClass() {
		super();
		System.out.println("SubClass-----");
	}

	public SubClass(int i) {
		super(i);
		System.out.println("SubClass" + i);
	}
}
