package the_fifteenth;
/**
 * 这个就是咖啡啦
 * @author Mr_Wrong
 *
 */
public class Coffee {
	private static long count = 0;
	private final long id = count++;
	public String toString() {
		return getClass().getSimpleName()+""+id;
	}

}
