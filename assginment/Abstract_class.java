package assginment;

abstract class Parent{
	abstract public void message();
}
class subclass1 extends Parent{

	@Override
	public void message() {
		System.out.println("This is a first sublcass");
		
	}
	
}
class subclass2 extends Parent{

	@Override
	public void message() {
		System.out.println("This is a second subclass");
		
	}
	
}



public class Abstract_class {
	public static void main(String[] args) {
		subclass1 sb1 = new subclass1();
		subclass2 sb2 = new subclass2();
		sb1.message();
		sb2.message();
	}

}
