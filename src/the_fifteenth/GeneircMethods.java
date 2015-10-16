package the_fifteenth;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型方法
 * @author Mr_Wrong
 *
 */
public class GeneircMethods {
	public <T> void f(T x){
		System.out.println(x.getClass().getSimpleName());
	}
	public static void main(String[] args) {
		GeneircMethods m = new GeneircMethods();
		m.f("");
		m.f(1);
		m.f(1.0);
		m.f(m);
	}
	public static <T> List<T> makelist(T...args){
		List<T> result = new ArrayList<T>();
		for(T item: args){
			result.add(item);
		}
		return result;
	}
}
