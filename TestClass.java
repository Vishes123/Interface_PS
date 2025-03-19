package interface_ps;

public class TestClass implements Test {

	@Override
	public void demo() {
		
		System.out.println("I am demo method");
		
	}
	
	public static void main(String[] args) {
		Test.teststatic();
		TestClass  t = new TestClass();
		t.demo();
		t.say();
		
	}

}
