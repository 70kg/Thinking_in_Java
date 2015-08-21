package the_tenth;
/**
 * 在接口内可以定义类
 * @author Mr_Wrong
 * 
 * 只有实现了这个接口的类  才能访问到这个内部类  所以可以被实现了这个接口的所以类所共用
 *
 */
public interface ClassInInterface {
	void howby();
	class TestClassInInterface implements ClassInInterface{
		public void howby() {
			System.out.println("这是接口内部的类的howby方法");			
		}
		public static void main(String[] args) {
			new TestClassInInterface().howby();
			System.out.println("这是共用的部分");
		}
	}
}
