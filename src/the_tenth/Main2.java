package the_tenth;
/**
 * 匿名内部类和工厂方法
 * @author Mr_Wrong
 *
 */
interface Service{
	void method1();
	void method2();
}
interface ServiceFactory{//抽象工厂接口 用于返回工厂产品
	Service getService();
}

class Implementation1 implements Service{

	public void method1() {
		System.out.println("Implementation1.method1");
	}

	public void method2() {
		System.out.println("Implementation1.method2");
	}
	public static ServiceFactory factory = new ServiceFactory() {

		public Service getService() {
			return new Implementation1();
		}
	};

}

class Implementation2 implements Service{

	public void method1() {
		System.out.println("Implementation2.method1");
	}

	public void method2() {
		System.out.println("Implementation2.method1");
	}
	public static ServiceFactory factory = new ServiceFactory() {

		public Service getService() {
			return new Implementation2();
		}
	};

}
public class Main2 {
	
	public static void serviceConsumer(ServiceFactory factory){
		Service s = factory.getService();
		s.method1();
		s.method2();
		
	}
	public static void main(String[] args) {

		serviceConsumer(Implementation1.factory);
		serviceConsumer(Implementation2.factory);
	}
}
