package the_fifteenth;

public class Tuple<A,B> {
	public final A first;
	public final B second;
	public Tuple(A a,B b ){
		this.first = a;
		this.second= b;
	}
	public String toString(){
		return first+","+second;
	}
	static Tuple<String,Integer> f(){
		return new Tuple<String, Integer>("hahah", 12);
	}
	public static void main(String[] args) {
		System.out.println(f());
	}
}
