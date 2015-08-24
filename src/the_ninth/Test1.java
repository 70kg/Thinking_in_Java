package the_ninth;

public class Test1 {

	public static void main(String[] args) {
		TestInterface interface1 = new Test2();
		System.out.println(interface1.dothings());
		
		
		Test3 test3 = new Test3();
		System.out.println(test3.getinterface().dothings());
	}
}
