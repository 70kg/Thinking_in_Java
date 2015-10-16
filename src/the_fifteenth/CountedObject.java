package the_fifteenth;

public class CountedObject {
	private static long count = 0;
	private final long id = count++;
	private long id(){return id;}
	public String toString(){return "CountedObject"+id;}
	public CountedObject(){}
	public CountedObject(int a,int b){
		System.out.println(a+b);
	}
}
