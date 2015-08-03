package the_sevent;
/**
 * 待参数的构造器
 * 
 * 父类是有参的构造函数   子类必须显示的调用super.父类的构造参数
 * @author Mr_Wrong
 *
 */
public class The_seventh {

	public static void main(String[] args) {
		Chess chess = new Chess(10);
	}

}
class Game{
	Game(int i){
		System.out.println("这是game的有参构造函数");
	}
}
class BoardGame extends Game{

	BoardGame(int i) {
		super(i);
		System.out.println("这是boardgame的有参构造函数");	
	}
}
class Chess extends BoardGame{

	Chess(int i) {
		super(i);
		System.out.println("这是chess的有参构造函数");
	}

}