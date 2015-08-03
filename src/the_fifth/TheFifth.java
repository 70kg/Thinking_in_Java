package the_fifth;

public class TheFifth {
	/*
	 * 这个类被加载之后，先去加载其中的静态的对象，然后是非静态的对象 在静态的Table中  又有静态的bowl1和bowl2  所以他们也会被加载 然后去执行bowl的构造函数。。。
	 */
	
	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();


	public static void main(String[] args) {
		System.out.println("开始打印new Cupboard ");
		new Cupboard();
		System.out.println("开始打印new Cupboard ");
		new Cupboard();
		
		//table.f2(1);
		//cupboard.f3(1);

	}
}
class Bowl{
	Bowl(int i){
		System.out.println("Bowl :"+ i);
	}
	void f1(int i){
		System.out.println("f1 :"+ i);
	}
}

class Table {
	static Bowl bowl1 = new Bowl(1);
	static Bowl bowl2 = new Bowl(2);
	Table(){
		System.out.println("Table()");
		bowl2.f1(1);
	}
	void f2(int i){
		System.out.println("f2 :"+i);
	}

}
class Cupboard{
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	static Bowl bowl5 = new Bowl(5);
	Cupboard(){
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	void f3(int i){
		System.out.println("f3 :"+i);
	}
}