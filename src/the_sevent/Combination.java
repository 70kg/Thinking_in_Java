package the_sevent;
/**
 * 使用组合
 * @author Mr_Wrong
 *
 */
public class Combination {
	public static void main(String[] args) {
		Car car = new Car();
		car.engine.start();
		
		car.left.window.roolup();
	}
}
class Engine{
	public void start(){System.out.println("打开发动机");}
	public void stop(){System.out.println("关闭发动机");}
	public void rev(){System.out.println("重启发动机");}
}
class Wheel{
	public void inflate(int psi){}
}
class Window{
	public void roolup(){System.out.println("打开窗户");}
	public void rooldown(){System.out.println("关闭窗户");}
}
class Door{
	public Window window = new Window();
	public void open(){System.out.println("打开门");}
	public void close(){System.out.println("关闭门");}
}
class Car{
	Engine engine = new Engine();
	Wheel[] wheels = new Wheel[4];
	Door 
	left = new Door(),
	right = new Door();
	Car(){
		for(int i=0;i<4;i++){
			wheels[i]= new Wheel();
		}
	}


}