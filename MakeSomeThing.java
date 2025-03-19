package interface_ps;
public class MakeSomeThing implements Pizza{
	
	// so if we want to pizza then simple we implement  pizza interface this interface say what to do 
	// which types of items we needed.

	@Override
	public void dough() {

		System.out.println("Make a Dough First");
	}

	@Override
	public void sauce() {
		System.out.println("Mix / Put some sauces in dough");
		
	}

	@Override
	public void cheese() {
		System.out.println("Add some cheese according to your test/quentity");
		
	}

	@Override
	public void topingIngedients() {

		System.out.println("Toping some Ingedient on dough");
	}
	
	public static void main(String[] args) {
		MakeSomeThing m = new MakeSomeThing();
		m.dough();
		m.sauce();
		m.cheese();
		m.topingIngedients();
	}
	
	
}
