package the_ninth;

public class Main1 {
	public static String ss = "wwwLLLLHHHhhhh";
	static void process1(ProcessorInterface p,String s){
		System.out.println(p.name());
		System.out.println(p.process(s));
	}
	public static void main(String[] args) {
		process1(new Upcase1(), ss);
	}

}
interface ProcessorInterface{

	String name();
	Object process(Object input);

}


/**
 * 让抽象类去实现接口 不需要实现全部的方法 可以只实现一部分  然后剩下的子类去实现 
 * 子类必须实现抽象类中的抽象方法 
 * 
 * 感觉抽象类可以作为普通类的一个缓冲   接口是完全的抽象  当只需要具有接口的部分特性  可以使用抽象类
 * 
 * 一个类实现了一个接口  就可以把这个类当做接口的实例穿进去
 * @author Mr_Wrong
 *
 */
abstract class StringProcessor implements ProcessorInterface{

	public String name() {
		return getClass().getSimpleName();
	}
	public abstract  String process(Object input);

}
class Upcase1 extends StringProcessor{

	@Override
	public String process(Object input) {
		return ((String)input).toUpperCase();
	}
}
class Downcase1 extends StringProcessor{
	@Override
	public String process(Object input) {
		// TODO Auto-generated method stub
		return ((String)input).toLowerCase();
	}
}
