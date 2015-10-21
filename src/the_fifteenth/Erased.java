package the_fifteenth;

/**
 * 泛型的擦除
 * @author Mr_Wrong
 *
 * @param <T>
 */
public class Erased<T> {
	private final int SIEZE = 100;
	Class<T> kind;
	public  void f(Object args){
//		if(args instanceof T){//Cannot perform instanceof check against type parameter T. 
//			                 //Use its erasure Object instead since further generic type information will be erased at runtime
//		}
		if(kind.isInstance(args)){
			
		}
	}
	public static void main(String[] args) {

	}
}
