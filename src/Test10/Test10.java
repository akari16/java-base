//·ÃÎÊ¿ØÖÆmodifier

package Test10;

public class Test10 {
	public int public_i;
	private int private_i;
	protected int protected_i;
	int default_i;

	public void public_m() {

	}

	private void private_m() {

	}

	protected void protected_m() {

	}

	// default
	void default_m() {

	}

	void test() {

		Test10 a = new Test10();
		int r = a.default_i;
		r = a.private_i;
		r = a.protected_i;
		r = a.public_i;

		a.default_m();
		a.private_m();
		a.protected_m();
		a.public_m();

	}

}
