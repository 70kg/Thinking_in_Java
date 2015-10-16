package the_fifteenth;

import java.lang.reflect.Constructor;

public class BaseGenerator<T> implements Generator<T>{
	private Class<T> type;
	private Object[] a;
	public BaseGenerator(Class<T> type){this.type = type;}
	public BaseGenerator(Class<T> type,Object[] a){this.type = type;this.a= a;;}

	public T next() {
		try {
			return type.newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		} 
	}
	public T next(Class<?>... agrs) {
		try {
			Constructor c = type.getDeclaredConstructor(agrs);
			c.setAccessible(true); 
			return (T) c.newInstance(a);
		}catch (Exception e) {
			throw new RuntimeException();
		} 
	}
	
	public static <T> Generator<T> create(Class<T> type){
		return new BaseGenerator<T>(type);
	}
	public static <T> Generator<T> create(Class<T> type,Object[] a){
		return new BaseGenerator<T>(type,a);
	}
}
