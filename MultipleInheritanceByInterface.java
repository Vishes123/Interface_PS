package interface_ps;

interface A {
	void show();

}

interface B {
	void display();
}

public class MultipleInheritanceByInterface implements A, B {

	@Override
	public void display() {

		System.out.println("Interface A");
	}

	@Override
	public void show() {
		System.out.println("Interface B");
	}

	public static void main(String[] args) {

	}
}
