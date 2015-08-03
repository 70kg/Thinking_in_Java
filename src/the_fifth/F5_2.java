package the_fifth;

public class F5_2 {
	static Cups cups1 = new Cups();
	static Cups cups2 = new Cups();

	public static void main(String[] args) {
		System.out.println("开始初始化啦啊啦拉拉");
		cups1.cup1.f(1);
		
		 PrintArray.f("one","weo","lalas");
	}

}
class Cup{
	Cup(int i ){
		System.out.println("cup()" +i);
	}
	void f(int i ){
		System.out.println("f:"+i);
	}
}
class Cups{
	static Cup cup1;
	static Cup cup2;
	static{
		cup1  = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups(){
		System.out.println("cups()");
	}

}
 class PrintArray{
	static void f(String... strings ){
		for (String s : strings) {
			System.out.println(s+" ");
		}
	}
}