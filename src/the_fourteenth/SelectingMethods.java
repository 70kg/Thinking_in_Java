package the_fourteenth;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import the_fourteenth.MethodSelector.SomeMethods;

/**
 * 动态代理
 * @author Mr_Wrong
 *
 */
class MethodSelector implements InvocationHandler{
	private Object proxied;
	public MethodSelector(Object proxied){
		this.proxied  = proxied;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if(method.getName().equals("interesting")){
			System.out.println("这是有趣的方法");
		}		return method.invoke(proxied, args);
	}

	interface SomeMethods{
		void boring1();
		void boring2();
		void interesting(String name);
	}
}
//实现的类  被代理的
class Implementation implements SomeMethods{

	public void boring1() {
		System.out.println("这是无聊1");			
	}

	public void boring2() {
		System.out.println("这是无聊2");			

	}

	public void interesting(String name) {
		System.out.println("这是有趣"+name);			
	}
}
public class SelectingMethods{
	public static void main(String[] args) {
		SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(SomeMethods.class.getClassLoader(), new Class[]{SomeMethods.class},
				new MethodSelector(new Implementation()));

		proxy.boring1();
		proxy.interesting("这是动态的代理");
	}

}
