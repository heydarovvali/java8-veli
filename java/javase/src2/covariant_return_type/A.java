package covariant_return_type;

public class A extends B {
	@Override
	public D m1() {
		D c = new D();
		return c;
	}
}
