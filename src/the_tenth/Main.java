package the_tenth;
/**
 * 内部类
 * @author Mr_Wrong
 *
 */
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.inner().outer().f();
		
		Inner inner = main.new Inner();//使用.new创建内部类
	}
	class Inner{
		public Main outer(){
			return Main.this;
		}
	}
	
	public Inner inner(){return new Inner();}

	public void f(){
		System.out.println("这是外部类的方法");
	}

}
