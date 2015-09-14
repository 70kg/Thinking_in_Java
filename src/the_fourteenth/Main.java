package the_fourteenth;
/**
 * 第十四章 类型信息
 * 反射 动态代理什么的
 * @author Mr_Wrong
 *
 */

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
class Toy{
	Toy() {
	}
	Toy(int i) {
	}
}
class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
	FancyToy(){
		super(1);
	}
}

public class Main {
	static void printinfo(Class cc){
		System.out.println("class name:"+cc.getName()+"is interface?["+cc.isInterface()+"]");
		System.out.println("simple name:"+cc.getSimpleName());
		System.out.println("Canonical name:"+cc.getCanonicalName());
	}
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("the_fourteenth.FancyToy");
		} catch (Exception e) {
			System.out.println("没发现fancy");	
		}

		printinfo(c);

	}
}
