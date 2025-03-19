package interface_ps;

public interface Test {
	

	// in interface we can create only public Abstract method
	// variable will be by default public static final
	// in interface java version 8 or upper version we able to create default concrete type method
	// main purpose of inheritance we can say it is blue print of class that can only say what to do .
	
	public void demo();
	
	default void say() {
		System.out.println("I am default method");
	}
	
	// hear we can also create  public static concrete type method.
	// main purpose of static concrete method it's given information about interface if e.g i have multiple
	//abstract method or we don't know about interface working that we can  describe into static concrete method
	static void teststatic() {
		System.out.println("i am static method");
	}
	
}


