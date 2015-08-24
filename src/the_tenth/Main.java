package the_tenth;


/**
 * 内部类
 * @author Mr_Wrong
 *
 *因为每个内部类可以分别独立继承和实现接口  也就是变相的多重继承问题   
 */
public class Main implements ClassInInterface{
	public static void main(String[] args) {
		Main main = new Main();
		main.inner().outer().f();

		Inner inner = main.new Inner();//使用.new创建内部类



		TestClassInInterface classininterface = new TestClassInInterface();
		classininterface.howby();//这样就可以访问接口的中的内部类
		//TestClassInInterface.main(args);

		Test test = new Test();
		test.howby();

		new Main().howby();



	}
	class Inner{
		public Main outer(){
			return Main.this;
		}
	}

	public Inner inner(){return new Inner();}

	public void f(){
		System.out.println("这是外部类的方法");
	}




	public void howby() {
		System.out.println("这是实现类的方法");		
	}

}

class Test implements ClassInInterface{
	TestClassInInterface t = new TestClassInInterface();

	public void howby() {
		System.out.println("这是test的方法");		
	}

}


