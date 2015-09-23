package the_fourteenth;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 方法的反射
 * @author Mr_Wrong
 *
 */
public class Main4 {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("the_fourteenth.Reflect");
			Method method = c.getMethod("test", null);
			method.setAccessible(true);
			method.invoke(c.newInstance(), null);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Reflect{
	private void test(){
		System.out.println("这是反射的");
	}
}