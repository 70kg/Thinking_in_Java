package the_fourteenth;

import java.util.ArrayList;
import java.util.List;



/**
 * 泛化的class引用
 * @author Mr_Wrong
 *
 */

class CountedInteger{
	private static long counter;
	private final long id = counter++;
	public String toString() {
		return Long.toString(id);
	}
}
class FilledList<T>{
	private Class<T> type;
	FilledList(Class<T> type){
		this.type = type;
	}
	public List<T> create(int nElements){
		List<T> result = new ArrayList<T>();
		try {
			for (int i = 0; i < nElements; i++) {
				result.add(type.newInstance());
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}
}
public class Mian2 {
	public static void main(String[] args) {

		FilledList<CountedInteger> f1 = new FilledList<CountedInteger>(CountedInteger.class);
		System.out.println(f1.create(15));
	}

}
