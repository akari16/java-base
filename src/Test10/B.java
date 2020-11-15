package Test10;

public class B {
	void test() {
		Test10 a = new Test10();
		int r = a.default_i;
		r = a.protected_i;
		r = a.public_i;

		// r = a.private;

		a.public_m();
		a.protected_m();
		a.default_m();
		// a.private_m();
	}
}
