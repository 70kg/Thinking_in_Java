package the_fifteenth;

public class Holder<T> {
	private T a;
	public Holder(T a){this.a = a;}
	public T get(){return a;}
	public void set(T a){this.a = a;}

	public static void main(String[] args) {
		Holder<Mobile> holder = new Holder<Mobile>(new Mobile());
		holder.get();
		holder.set(new Mobile());
	}
}
class Mobile{}
