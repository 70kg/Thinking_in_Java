package the_ninth;
/**
 * 一个类 可以实现多个接口  就可以实现向上转型为多个基类型 
 * 
 * 同时  接口可以继承  而且是可以"多重继承"
 * @author Mr_Wrong
 *
 */
public class Main3 {
	public static void t(Canfight f){
		f.fight();
	}
	public static void w(Canswim w){
		w.swim();
	}
	public static void y(Canfly y){
		y.fly();
	}
	public static void main(String[] args) {
		Hero h = new Hero();
		
		t(h);
		w(h);
		y(h);
	}

}
interface Canfly{
	void fly();
}
interface Canswim{void swim();}
interface Canfight{void fight();}


class ActionCharacter{
	public  void fight() {
		System.out.println("打架");
	}
}
class Hero extends ActionCharacter implements Canfight,Canfly,Canswim{

	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("游泳");
	}

	public void fly() {
		System.out.println("飞");

	}

}





interface Monster{
	void menace();
}
interface DangerousMonster extends Monster{
	void destory();
}
interface Lethal{
	void kill();
}

interface Vampire extends Lethal,DangerousMonster{
	void drinkblood();
}

